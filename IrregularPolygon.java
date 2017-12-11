import java.awt.geom.*;     // for Point2D.Double
import java.util.ArrayList; // for ArrayList
import gpdraw.*;

public class IrregularPolygon{
   private ArrayList <Point2D.Double> myPolygon;
   // constructors
   public IrregularPolygon() {
    
    }

   // public methods
   public void add(Point2D.Double aPoint) { }

   public void draw() { }

   public double perimeter() {
       double perimeter = 0.0;
       for(int i = 0; i < myPolygon.size() - 1; i++){
           double x1 = myPolygon.get(i).getX();
           double x2 = myPolygon.get(i+1).getX();
           double y1 = myPolygon.get(i).getY();
           double y2 = myPolygon.get(i+1).getY();
           perimeter += Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        }
       for(int i = myPolygon.size() - 1; i < myPolygon.size(); i++){
           double x1 = myPolygon.get(i).getX();
           double x2 = myPolygon.get(0).getX();
           double y1 = myPolygon.get(i).getY();
           double y2 = myPolygon.get(0).getY();
           perimeter += Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        }
       return perimeter; 
   }

   public double area() {
    double area = 0.0;
    double total = 0.0;
        for(int i = 0; i < myPolygon.size() - 1; i++){
           double x1 = myPolygon.get(i).getX();
           double y2 = myPolygon.get(i+1).getY();
           total += x1 * y2;
        }
        for(int i = myPolygon.size() - 1; i < myPolygon.size(); i++){
           double x1 = myPolygon.get(i).getX();
           double y2 = myPolygon.get(0).getY();
           total += x1 * y2;
        }
    area = Math.abs(0.5 * total);
    return area;
    }
}