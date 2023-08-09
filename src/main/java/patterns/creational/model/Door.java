package patterns.creational.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Door implements MazeStructure
{
    private boolean isOpen;

    private Room room1;
    private Room room2;

    public Door(Room room1, Room room2)
    {
        this.room1 = room1;
        this.room2 = room2;
    }

    @Override
    public void Enter()
    {

    }
}
