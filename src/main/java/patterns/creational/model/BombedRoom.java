package patterns.creational.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BombedRoom extends Room
{
    private boolean isBombed;

    public BombedRoom(int roomNumber)
    {
        super(roomNumber);
    }

}
