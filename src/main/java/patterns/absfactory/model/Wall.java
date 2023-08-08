package patterns.absfactory.model;

public class Wall implements MazeStructure
{
    @Override
    public void Enter()
    {
        throw new RuntimeException("This is a wall!!");
    }
}
