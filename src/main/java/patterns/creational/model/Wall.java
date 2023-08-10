package patterns.creational.model;

public class Wall implements MazeStructure
{
    @Override
    public void Enter()
    {
        throw new RuntimeException("This is a wall!!");
    }

    // for prototype
    public Wall clone()
    {
        return new Wall(); // wall has no props to copy
    }
}
