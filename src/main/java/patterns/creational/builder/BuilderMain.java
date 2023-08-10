package patterns.creational.builder;

import patterns.creational.model.Maze;
import patterns.creational.model.MazeGame;
import patterns.creational.model.Room;

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
