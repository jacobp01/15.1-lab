import java.awt.geom.*;     // for Point2D.Double
import java.util.ArrayList; // for ArrayList
// import gpdraw.*;

public class IrregularPolygon{
   private ArrayList <Point2D.Double> myPolygon;
   // constructors
   public IrregularPolygon() {
    
    }

   // public methods
   public void add(Point2D.Double aPoint) { }

   public void draw() { }

   public double perimeter() {
       int perimeter = 0;
       for(Point2D.Double pt: myPolygon){
           pt.getX = "x1";
           pt.getY = "y1";
        }
   }

   public double area() { }
}