package openclosedprinciple;

public class ShapeCalculator {
    double calculateArea(String shapeType,int width ,int height , int radius  ){
      if(shapeType.equalsIgnoreCase("rectangle")){
          return width*height;
      }
      else if(shapeType.equalsIgnoreCase("circle")){
          return 3.14 *(radius)*(radius);
      }
      else{
          return 1;
      }
    }
    double calculatePerimeter(String shapeType,int width ,int height , int radius){
        if(shapeType.equalsIgnoreCase("rectangle")){
            return 2*(width+height);
        }
        else if(shapeType.equalsIgnoreCase("circle")){
            return 2*3.14 *(radius);
        }else{
            return 1;
        }
    }
}
