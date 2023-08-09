package patterns.creational.builder;

import patterns.creational.model.Door;
import patterns.creational.model.Room;

public class StandardMazeBuilder extends MazeBuilder
{
    @Override
    public MazeBuilder buildRoom(int roomNumber)
    {
        getRooms().add(new Room(roomNumber));
        return this;
    }

    @Override
    public MazeBuilder buildDoor(int roomFromId, int roomToId, Room.Direction directionOfDoorRoom1)
    {
        Room roomFrom = getRooms().stream()
            .filter(r -> r.getRoomNumber() == roomFromId)
            .findFirst()
            .orElseThrow(RuntimeException::new);

        Room roomTo = getRooms().stream()
            .filter(r -> r.getRoomNumber() == roomToId)
            .findFirst()
            .orElseThrow(RuntimeException::new);

        Door door = new Door(roomFrom, roomTo);
        roomFrom.setSide(directionOfDoorRoom1, door);
        roomTo.setSide(directionOfDoorRoom1.getOpposite(), door);
        return this;
    }

}
