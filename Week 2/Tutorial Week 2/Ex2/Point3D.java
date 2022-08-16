
import java.lang.Math;

//create private variables
class Point3D {
    private double x;
    private double y;
    private double z;

    /*
     * public Point3D() {
     * 
     * }
     */

    // Add a overload constructor to initialize the variables passed.
    public Point3D(double X, double Y, double Z) {
        x = X;
        y = Y;
        z = Z;

    }

    // Add a method called "distance" to calculate the distance from origin to a
    // point.
    public double distance() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

}
