import java.awt.geom.*;     // for Point2D.Double
import java.util.ArrayList; // for ArrayList
import gpdraw.*;

public class JacobPawlak implements Polygon{
   private ArrayList <Point2D.Double> myPolygon = new ArrayList<Point2D.Double>();
   private SketchPad myPaper = new SketchPad(500,500);
   private DrawingTool myPencil = new DrawingTool(myPaper);

   // constructors
   public JacobPawlak() {}

   // public methods
   public void add(Point2D.Double aPoint) {
    myPolygon.add(aPoint);
   }

   public void draw() {
        myPencil.up();
        myPencil.move(myPolygon.get(0).getX(), myPolygon.get(0).getY());
        myPencil.down();
 
        for(int i = 1; i < myPolygon.size(); i++)
        {
            myPencil.move(myPolygon.get(i).getX(), myPolygon.get(i).getY());
        }
        myPencil.move(0,0);
    }
   
   public String getName(){
    return "Jacob Pawlak";
    }

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
        for(int a = 0; a < myPolygon.size() - 1; a++){
           double x1 = myPolygon.get(a).getX();
           double y2 = myPolygon.get(a+1).getY();
           total += (x1 * y2);
        }
        for(int a = 0; a < myPolygon.size() - 1; a++){
           double y1 = myPolygon.get(a).getY();
           double x2 = myPolygon.get(a+1).getX();
           total -= (y1 * x2);
        }
        for(int a = myPolygon.size() - 1; a < myPolygon.size(); a++){
           double x1 = myPolygon.get(a).getX();
           double y2 = myPolygon.get(0).getY();
           total += (x1 * y2);
        }
         for(int a = myPolygon.size() - 1; a < myPolygon.size(); a++){
           double y1 = myPolygon.get(a).getY();
           double x2 = myPolygon.get(0).getX();
           total += (y1 * x2);
            
            }
   area = Math.abs(0.5 * total);
   return area;
    }
}