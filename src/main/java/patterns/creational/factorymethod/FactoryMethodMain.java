package patterns.creational.factorymethod;

import patterns.creational.model.Maze;

public class FactoryMethodMain
{
    public static void main(String[] args)
    {
        System.out.println("Creating Normal Maze");
        MazeGame mazeGame = new MazeGame();
        Maze normalMaze = mazeGame.createMaze();

        System.out.println("-----------------------------");
        System.out.println("Creating Bombed Maze");
        MazeGame bombedMazeGame = new BombedMazeGame();
        Maze bombedMaze = bombedMazeGame.createMaze();

        System.out.println("-----------------------------");
        System.out.println("Creating Enchanted Maze");
        MazeGame enchantedMazeGame = new EnchantedMazeGame();
        Maze enchantedMaze = enchantedMazeGame.createMaze();
    }
}
