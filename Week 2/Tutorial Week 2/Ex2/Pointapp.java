public class Pointapp {
    public static void main(String[] args) {

        // create two objects of the class Point3D.
        Point3D p1 = new Point3D(6.5, 8.1, 4.2);
        Point3D p2 = new Point3D(9.5, 7.1, 8.2);

        // Calculate and display the distance to the origin of these objects.
        System.out.println("Distance to orgin of p1 is " + p1.distance());
        System.out.println("Distance to orgin of p1 is " + p2.distance());
    }
}