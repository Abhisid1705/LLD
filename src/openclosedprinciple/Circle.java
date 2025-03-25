package openclosedprinciple;

public class Circle extends Shape{
    @Override
    double calculateArea(String shapeType, int width, int height, int radius) {
        return 3.14 *(radius)*(radius);
    }

    @Override
    double calculatePerimeter(String shapeType, int width, int height, int radius) {
        return 2*3.14 *(radius);
    }
}
