package patterns.creational.factorymethod;

import patterns.creational.model.Door;
import patterns.creational.model.Maze;
import patterns.creational.model.Room;
import patterns.creational.model.Wall;

public class MazeGame
{

    public Maze createMaze()
    {
        Maze maze = makeMaze();

        Room room1 = makeRoom(1);
        Room room2 = makeRoom(2);

        Door door = makeDoor(room1, room2);

        maze.addRoom(room1);
        maze.addRoom(room2);

        room1.setSide(Room.Direction.NORTH, makeWall());
        room1.setSide(Room.Direction.EAST, door);
        room1.setSide(Room.Direction.SOUTH, makeWall());
        room1.setSide(Room.Direction.WEST, makeWall());

        room2.setSide(Room.Direction.NORTH, makeWall());
        room2.setSide(Room.Direction.EAST, makeWall());
        room2.setSide(Room.Direction.SOUTH, makeWall());
        room2.setSide(Room.Direction.WEST, door);

        return maze;
    }

    // Factory methods

    public Maze makeMaze()
    {
        System.out.println("Making maze");
        return new Maze();
    }

    public Room makeRoom(int roomNumber)
    {
        System.out.println("Making room");
        return new Room(roomNumber);
    }

    public Wall makeWall()
    {
        System.out.println("Making wall");
        return new Wall();
    }

    public Door makeDoor(Room room1, Room room2)
    {
        System.out.println("Making door");
        return new Door(room1, room2);
    }
}
