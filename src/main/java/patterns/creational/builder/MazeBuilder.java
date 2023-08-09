package patterns.creational.builder;

import lombok.Getter;
import patterns.creational.model.Maze;
import patterns.creational.model.Room;

import java.util.ArrayList;
import java.util.List;

public abstract class MazeBuilder
{

    private List<Room> rooms = new ArrayList<>();

    public Maze buildMaze()
    {
        return new Maze(this.rooms);
    }

    public MazeBuilder buildRoom(int roomNumber)
    {
        return this;
    }

    public MazeBuilder buildDoor(int roomFromId, int roomToId, Room.Direction directionOfDoorRoom1)
    {
        return this;
    }

    public List<Room> getRooms()
    {
        return rooms;
    }
}
