package patterns.creational.factorymethod;

import patterns.creational.model.BombedRoom;
import patterns.creational.model.BombedWall;
import patterns.creational.model.Room;
import patterns.creational.model.Wall;

public class BombedMazeGame extends MazeGame
{
    @Override
    public Wall makeWall()
    {
        System.out.println("Making bombed wall");
        return new BombedWall();
    }

    @Override
    public Room makeRoom(int roomNumber)
    {
        System.out.println("Making bombed room");
        return new BombedRoom(roomNumber);
    }
}
