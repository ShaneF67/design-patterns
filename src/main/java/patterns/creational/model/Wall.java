package patterns.creational.model;

public class Wall implements MazeStructure
{
    @Override
    public void Enter()
    {
        throw new RuntimeException("This is a wall!!");
    }
}
