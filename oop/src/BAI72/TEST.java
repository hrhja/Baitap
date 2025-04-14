package BAI72;

import java.util.ArrayList;
import java.util.List;

public class TEST {
public static void main(String[] args) {
      
        PolyLine l1 = new PolyLine();
        System.out.println("Polyline l1: " + l1);  

    
        l1.appendPoint(new Point(1, 2));
        l1.appendPoint(4, 6);
        l1.appendPoint(8, 10);
        System.out.println("Polyline l1: " + l1);  
        System.out.println("Total Length l1: " + l1.getLength());

      
        List<Point> points = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(3, 4)); 
        points.add(new Point(6, 8));  
        PolyLine l2 = new PolyLine(points);
        System.out.println("Polyline l2: " + l2);  
        System.out.println("Total Length l2: " + l2.getLength()); 
    }
}

