package patterns.absfactory.factory;

import patterns.absfactory.model.Door;
import patterns.absfactory.model.DoorNeedingSpell;
import patterns.absfactory.model.EnchantedRoom;
import patterns.absfactory.model.Room;

public class EnchantedMazeFactory extends MazeFactory
{

    @Override
    public Room makeRoom(long roomNumber)
    {
        return new EnchantedRoom(roomNumber);
    }

    @Override
    public Door makeDoor(Room room1, Room room2)
    {
        return new DoorNeedingSpell(room1, room2);
    }
}
