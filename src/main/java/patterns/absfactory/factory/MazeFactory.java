package patterns.absfactory.factory;

import patterns.absfactory.model.Door;
import patterns.absfactory.model.Maze;
import patterns.absfactory.model.Room;
import patterns.absfactory.model.Wall;

public class MazeFactory
{
    public Maze makeMaze()
    {
        return new Maze();
    }

    public Wall makeWall()
    {
        return new Wall();
    }

    public Room makeRoom(long roomNumber)
    {
        return new Room(roomNumber);
    }

    public Door makeDoor(Room room1, Room room2)
    {
        return new Door(room1, room2);
    }
}
