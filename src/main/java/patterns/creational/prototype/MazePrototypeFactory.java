package patterns.creational.prototype;

import patterns.creational.absfactory.factory.MazeFactory;
import patterns.creational.model.Door;
import patterns.creational.model.Maze;
import patterns.creational.model.Room;
import patterns.creational.model.Wall;

public class MazePrototypeFactory extends MazeFactory
{
    private Maze maze;
    private Wall wall;
    private Room room;
    private Door door;

    public MazePrototypeFactory(Maze maze, Wall wall, Room room, Door door)
    {
        this.maze = maze;
        this.wall = wall;
        this.room = room;
        this.door = door;
    }

    public Wall makeWall()
    {
        System.out.println("Making proto wall");
        return wall.clone();
    }

    public Room makeRoom()
    {
        System.out.println("Making proto room");
        return room.clone();
    }

    public Door makeDoor()
    {
        System.out.println("Making proto door");
        return door.clone();
    }
}
