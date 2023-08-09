package patterns.creational.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoorNeedingSpell extends Door
{
    private String spellName;

    public DoorNeedingSpell(Room room1, Room room2)
    {
        super(room1, room2);
    }
}
