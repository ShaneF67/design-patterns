package patterns.creational.builder;

import patterns.creational.model.Maze;
import patterns.creational.model.MazeGame;
import patterns.creational.model.Room;

/**
 * INTENT:
 * Separate the construction of a complex object from its representation so that
 * the same construction process can create different representations
 */
public class BuilderMain
{
    public static void main(String[] args)
    {
        StandardMazeBuilder standardMazeBuilder = new StandardMazeBuilder();
        standardMazeBuilder.buildRoom(1);
        standardMazeBuilder.buildRoom(2);
        standardMazeBuilder.buildDoor(1, 2, Room.Direction.WEST);
        MazeGame game = new MazeGame();
        Maze maze = game.buildMaze(standardMazeBuilder);
        System.out.println("Built maze!");
    }
}
