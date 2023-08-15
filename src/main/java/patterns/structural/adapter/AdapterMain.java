package patterns.structural.adapter;

import patterns.structural.model.Circle;
import patterns.structural.model.Shape;

/**
 * Convert the interface of a class into another interface clients expect. Adapter
 * lets classes work together that couldn't otherwise because of incompatible
 * interfaces.
 */
public class AdapterMain
{
    public static void main(String[] args)
    {
        Shape circle = new Circle();

        // following is not possible as incompatible types
        //Shape textView = new TextView();

        // use our adapter
        Shape textShape = new TextShape();
    }
}
