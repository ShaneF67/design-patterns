package patterns.structural.adapter;

import patterns.structural.model.Manipulator;
import patterns.structural.model.Shape;
import patterns.structural.model.TextView;

public class TextShape extends TextView implements Shape
{
    @Override
    public void boundingBox(int bottomLeft, int topRight)
    {
        super.getOrigin(bottomLeft, topRight);
    }

    @Override
    public Manipulator createManipulator()
    {
        return new TextManipulator();
    }

    private class TextManipulator extends Manipulator
    {
        @Override
        public void manipulate()
        {
            // manipulate text
        }
    }
}
