package patterns.creational.model;

import patterns.creational.builder.MazeBuilder;

public class MazeGame
{
    public Maze createMaze(MazeBuilder mazeBuilder)
    {
        return mazeBuilder.buildMaze();
    }
}
