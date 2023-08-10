package patterns.creational.model;

public class BombedWall extends Wall
{
    @Override
    public void Enter()
    {
        throw new RuntimeException("This is a bombed wall!!");
    }
}
