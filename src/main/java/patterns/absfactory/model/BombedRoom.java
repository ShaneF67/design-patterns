package patterns.absfactory.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BombedRoom extends Room
{
    private boolean isBombed;

    public BombedRoom(long roomNumber)
    {
        super(roomNumber);
    }

}
