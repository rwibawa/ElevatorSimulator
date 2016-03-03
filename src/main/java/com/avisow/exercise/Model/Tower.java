package com.avisow.exercise.Model;

public class Tower
{
    public ILog Logger { get; set; }

    public Tower(int index)
    {
        Index = index;
        Stack = new Stack<int>();
    }

    protected int Index { get; private set; }
    public Stack<int> Stack { get; private set; }

    public void Add(int diskIndex)
    {
        if (Stack.Count != 0 && Stack.Peek() <= diskIndex)
        {
            Logger.ErrorFormat("Error add disk[{0}] to tower[{1}]!", diskIndex, Index);
        }
        else
        {
            //Logger.InfoFormat("Add disk[{0}] to tower[{1}]", diskIndex, Index);
            Stack.Push(diskIndex);
        }
    }

    public void MoveDisks(int numberOfDisks, Tower destination, Tower buffer)
    {
        if (numberOfDisks > 0)
        {
            MoveDisks(numberOfDisks - 1, buffer, destination);
            MoveTopTo(destination);
            buffer.MoveDisks(numberOfDisks - 1, destination, this);
        }
    }

    private void MoveTopTo(Tower destination)
    {
        int diskIndex = Stack.Pop();
        Logger.InfoFormat("Move disk[{0}] from Tower[{1}] to Tower[{2}]", diskIndex, this.Index, destination.Index);
        destination.Add(diskIndex);
    }
}