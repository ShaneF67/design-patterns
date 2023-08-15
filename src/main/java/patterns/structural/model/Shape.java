package patterns.structural.model;

/**
 * This has to be an interface to implement Adapter pattern in Java
 */
public interface Shape
{

    void boundingBox(int bottomLeft, int topRight);

    Manipulator createManipulator();
}
