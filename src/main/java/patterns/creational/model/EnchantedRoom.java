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

    public EnchantedRoom(long roomNumber)
    {
        super(roomNumber);
    }

    private long roomNumber;

    @Setter(AccessLevel.PRIVATE)
    private Map<Direction, MazeStructure> sides = new HashMap<>();

    public void setSide(Direction direction, MazeStructure structure)
    {
        sides.put(direction, structure);
    }

}
