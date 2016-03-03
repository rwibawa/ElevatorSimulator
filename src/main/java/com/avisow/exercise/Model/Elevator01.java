package com.avisow.exercise.Model;

public class Elevator01
{
    readonly Stack<int> queue = new Stack<int>();
    public ILog Logger { get; set; }

    public Elevator01(int minFloor, int maxFloor)
    {
        Min = minFloor;
        Max = maxFloor;
        CurrentFloor = Min;
    }

    public int Min { get; private set; }
    public int Max { get; private set; }
    public int CurrentFloor { get; private set; }
    public MoveDirection State { get; set; }

    public void MoveToFloor(int destinationFloor)
    {
        if (State == MoveDirection.Hold)
        {
            queue.Push(destinationFloor);
            return;
        }

        // Move up
        if (destinationFloor > CurrentFloor)
        {
            State = MoveDirection.Up;
            CurrentFloor = destinationFloor;
            State = MoveDirection.Stop;
            return;
        }

        // Move down
        if (destinationFloor < CurrentFloor)
        {
            State = MoveDirection.Down;
            CurrentFloor = destinationFloor;
            State = MoveDirection.Stop;
        }

    }

    public void ButtonGoToFloor(int destinationFloor)
    {
        MoveToFloor(destinationFloor);
    }

    public void ButtonCall(int floorIndex)
    {
        MoveToFloor(floorIndex);
        State = MoveDirection.Hold;
    }

    public void ButtonClose()
    {
        State = MoveDirection.Stop;
        if (queue.Count > 0)
        {
            int destinationFloor = queue.Pop();
            MoveToFloor(destinationFloor);
        }
    }
}
