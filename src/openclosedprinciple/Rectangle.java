package openclosedprinciple;

public class Rectangle extends Shape{
    @Override
    double calculateArea(String shapeType, int width, int height, int radius) {
        return width*height;
    }

    @Override
    double calculatePerimeter(String shapeType, int width, int height, int radius) {
        return 2*(width+height);
    }
}
