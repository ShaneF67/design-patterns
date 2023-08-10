package patterns.creational.model;

import java.util.ArrayList;
import java.util.List;

public class Maze
{
    private List<Room> rooms = new ArrayList<>();

    public Maze()
    {
    }

    public Maze(List<Room> rooms)
    {
        this.rooms = rooms;
    }

    public void addRoom(Room room)
    {
        rooms.add(room);
    }

    // for prototype
    public Maze clone()
    {
        return new Maze(rooms);
    }
}
