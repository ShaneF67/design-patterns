package patterns.creational.model;

import lombok.AccessLevel;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

public class Room
{

    public enum Direction
    {
        NORTH("SOUTH"), SOUTH("NORTH"), EAST("WEST"), WEST("EAST");

        String opposite;
        Direction(String opposite)
        {
            this.opposite = opposite;
        }

        public Direction getOpposite()
        {
            return Direction.valueOf(opposite);
        }
    }

    public Room(int roomNumber)
    {
        this.roomNumber = roomNumber;
    }

    private int roomNumber;

    @Setter(AccessLevel.PRIVATE)
    private Map<Direction, MazeStructure> sides = new HashMap<>();

    public void setSide(Direction direction, MazeStructure structure)
    {
        sides.put(direction, structure);
    }

    public int getRoomNumber()
    {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber)
    {
        this.roomNumber = roomNumber;
    }

    public Map<Direction, MazeStructure> getSides()
    {
        return sides;
    }

    // for prototype
    public Room clone()
    {
        Room clonedRoom = new Room(roomNumber);
        clonedRoom.sides = sides;
        return clonedRoom;
    }
}
