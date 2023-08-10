package patterns.creational.prototype;

import patterns.creational.absfactory.factory.MazeFactory;
import patterns.creational.model.Door;
import patterns.creational.model.Maze;
import patterns.creational.model.Room;
import patterns.creational.model.Wall;

/**
 * INTENT:
 * Specify the kinds of objects to create using a prototypical instance,
 * and create new objects by copying this prototype.
 */
public class PrototypeMain
{
    public static void main(String[] args)
    {
        MazeFactory mazeFactory = new MazeFactory();
        Maze maze = mazeFactory.makeMaze();
        Wall wall = mazeFactory.makeWall();
        Room room1 = mazeFactory.makeRoom(1);
        Room room2 = mazeFactory.makeRoom(2);
        Door door = mazeFactory.makeDoor(room1, room2);

        MazePrototypeFactory protoFactory = new MazePrototypeFactory(maze, wall, room1, door);
        Maze protoMaze = protoFactory.makeMaze();
        Wall protoWall = protoFactory.makeWall();
        Room protoRoom = protoFactory.makeRoom();
        Door protoDoor = protoFactory.makeDoor();

    }
}
