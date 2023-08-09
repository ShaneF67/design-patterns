package patterns.creational.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Room
{

    public enum Direction
    {
        NORTH, SOUTH, EAST, WEST
    }

    public Room(long roomNumber)
    {
        this.roomNumber = roomNumber;
    }

    private long roomNumber;

    @Setter(AccessLevel.PRIVATE)
    private Map<Direction, MazeStructure> sides = new HashMap<>();

    public void setSide(Direction direction, MazeStructure structure)
    {
        sides.put(direction, structure);
    }

}
