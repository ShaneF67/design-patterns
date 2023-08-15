package patterns.structural.model;

public class Circle implements Shape
{
    @Override
    public void boundingBox(int bottomLeft, int topRight)
    {

    }

    @Override
    public Manipulator createManipulator()
    {
        return null;
    }

    public class CircleManipulator extends Manipulator
    {
        @Override
        public void manipulate()
        {
            // manipulate circle
        }
    }
}
