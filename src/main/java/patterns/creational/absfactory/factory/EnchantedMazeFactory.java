package patterns.creational.absfactory.factory;

import patterns.creational.model.Door;
import patterns.creational.model.DoorNeedingSpell;
import patterns.creational.model.EnchantedRoom;
import patterns.creational.model.Room;

public class EnchantedMazeFactory extends MazeFactory
{

    @Override
    public Room makeRoom(int roomNumber)
    {
        return new EnchantedRoom(roomNumber);
    }

    @Override
    public Door makeDoor(Room room1, Room room2)
    {
        return new DoorNeedingSpell(room1, room2);
    }
}
