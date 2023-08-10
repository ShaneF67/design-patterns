package patterns.creational.model;

import patterns.creational.builder.MazeBuilder;

public class MazeGame
{
    public Maze buildMaze(MazeBuilder mazeBuilder)
    {
        return mazeBuilder.buildMaze();
    }

}
