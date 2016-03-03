package com.avisow.exercise;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    /*
    [TestMethod]
        public void ElevatorSetupTests()
        {
            Elevator01 elevator = new Elevator01(1, 3);
            Assert.AreEqual(1, elevator.Min, "The Min floor should be 1");
            Assert.AreEqual(3, elevator.Max, "The Max floor should be 3");
            Assert.AreEqual(1, elevator.CurrentFloor, "The CurrentFloor should be 1");
            Assert.AreEqual(MoveDirection.Stop, elevator.State, "The State should be Stop");
        }

        [TestMethod]
        public void ElevatorMoveUpTests()
        {
            Elevator01 elevator = new Elevator01(1, 3);
            elevator.MoveToFloor(2);
            Assert.AreEqual(2, elevator.CurrentFloor, "The CurrentFloor should be 2");
        }

        [TestMethod]
        public void ElevatorMoveDownTests()
        {
            Elevator01 elevator = new Elevator01(1, 3);
            elevator.MoveToFloor(3);
            Assert.AreEqual(3, elevator.CurrentFloor, "The CurrentFloor should be 3");
            elevator.MoveToFloor(2);
            Assert.AreEqual(2, elevator.CurrentFloor, "The CurrentFloor should be 2");
        }

        [TestMethod]
        public void ElevatorButtonGoTests()
        {
            Elevator01 elevator = new Elevator01(1, 3);
            elevator.ButtonGoToFloor(2);
            Assert.AreEqual(2, elevator.CurrentFloor, "The CurrentFloor should be 2");
        }

        [TestMethod]
        public void ElevatorButtonCallTests()
        {
            Elevator01 elevator = new Elevator01(1, 3);
            elevator.ButtonCall(2);
            Assert.AreEqual(2, elevator.CurrentFloor, "The CurrentFloor should be 2");
            Assert.AreEqual(MoveDirection.Hold, elevator.State, "The State should be Hold");
        }

        [TestMethod]
        public void ElevatorButtonCloseTests()
        {
            Elevator01 elevator = new Elevator01(1, 3);
            elevator.ButtonCall(2);
            Assert.AreEqual(2, elevator.CurrentFloor, "The CurrentFloor should be 2");
            Assert.AreEqual(MoveDirection.Hold, elevator.State, "The State should be Hold");
            elevator.ButtonGoToFloor(3);
            Assert.AreEqual(2, elevator.CurrentFloor, "The CurrentFloor should still be 2");
            elevator.ButtonClose();
            Assert.AreEqual(3, elevator.CurrentFloor, "The CurrentFloor should be 3");
        }

        [TestMethod]
        public void ElevatorButtonCallSimultantTests()
        {
            Elevator01 elevator = new Elevator01(1, 3);
            elevator.ButtonCall(1);
            Assert.AreEqual(1, elevator.CurrentFloor, "The CurrentFloor should be 1");
            Assert.AreEqual(MoveDirection.Hold, elevator.State, "The State should be Hold");
            elevator.ButtonGoToFloor(3);
            Assert.AreEqual(1, elevator.CurrentFloor, "The CurrentFloor should still be 1");
            elevator.ButtonCall(2);
            Assert.AreEqual(1, elevator.CurrentFloor, "The CurrentFloor should be 1");
            elevator.ButtonClose();
            Assert.AreEqual(2, elevator.CurrentFloor, "The CurrentFloor should be 2");
            elevator.ButtonClose();
            Assert.AreEqual(3, elevator.CurrentFloor, "The CurrentFloor should be 3");
        }
    * */
}
