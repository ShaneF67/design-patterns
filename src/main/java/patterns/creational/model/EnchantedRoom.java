package patterns.creational.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class EnchantedRoom extends Room
{

    public EnchantedRoom(int roomNumber)
    {
        super(roomNumber);
    }

    private int roomNumber;

    @Setter(AccessLevel.PRIVATE)
    private Map<Direction, MazeStructure> sides = new HashMap<>();

    public void setSide(Direction direction, MazeStructure structure)
    {
        sides.put(direction, structure);
    }

}
