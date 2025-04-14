package BAI43;

public class TEST {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(1.5f, 2.5f);
        System.out.println("Point2D: " + point2D);
        
        Point3D point3D = new Point3D(3.0f, 4.0f, 5.0f);
        System.out.println("Point3D: " + point3D);

        point3D.setXYZ(7.5f, 8.5f, 9.5f);
        System.out.println("Updated Point3D: " + point3D);
    }
}

