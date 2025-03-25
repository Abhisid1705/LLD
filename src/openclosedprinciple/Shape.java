package openclosedprinciple;
/*
* Cannot be instantiated – You cannot create an object of an abstract class.

Can have abstract methods – Methods without a body (implementation).

Can have concrete methods – Methods with an implementation.

Supports constructors – Can have constructors to initialize fields.

Allows fields (variables) – Can have instance variables.

Supports polymorphism – Allows method overriding in subclasses.
* */
public abstract class Shape {
    abstract double calculateArea(String shapeType, int width, int height, int radius);


    abstract double calculatePerimeter(String shapeType,int width ,int height , int radius);


}
