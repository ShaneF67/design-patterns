package patterns.absfactory;

import patterns.absfactory.factory.EnchantedMazeFactory;
import patterns.absfactory.factory.MazeFactory;
import patterns.absfactory.model.Door;
import patterns.absfactory.model.Maze;
import patterns.absfactory.model.Room;

public class MazeMain
{
    public static void main(String[] args)
    {
        Maze regularMaze = createMaze(new MazeFactory());
        Maze enchantedMaze = createMaze(new EnchantedMazeFactory());

    }

    private static Maze createMaze(MazeFactory factory)
    {
        Maze maze = factory.makeMaze();
        Room room1 = factory.makeRoom(1);
        Room room2 = factory.makeRoom(2);
        Door door = factory.makeDoor(room1, room2);

        maze.addRoom(room1);
        maze.addRoom(room2);

        room1.setSide(Room.Direction.NORTH, factory.makeWall());
        room1.setSide(Room.Direction.EAST, door);
        room1.setSide(Room.Direction.SOUTH, factory.makeWall());
        room1.setSide(Room.Direction.WEST, factory.makeWall());

        room2.setSide(Room.Direction.NORTH, factory.makeWall());
        room2.setSide(Room.Direction.EAST, factory.makeWall());
        room2.setSide(Room.Direction.SOUTH, factory.makeWall());
        room2.setSide(Room.Direction.WEST, door);

        return maze;
    }
}
