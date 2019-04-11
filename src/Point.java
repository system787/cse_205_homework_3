//**************************************************************************************************
// CLASS: Point (Point.java)
//
// DESCRIPTION
// This is the Point class from "Objects and Classes: Section 4".
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science and Engineering
// Fulton Schools of Engineering
// Arizona State University
// Tempe, AZ 85287-8809
// http://www.devlang.com
//**************************************************************************************************

public class Point implements Comparable<Point> {
    // A point in the Cartesian plane is located at (x, y) where x and y form the
    // coordinates of the point.
    private double x;
    private double y;

    // Constructor.
    public Point(double initX, double initY) {
        setX(initX);
        setY(initY);
    }

    // Accessor method for x.
    public double getX() {
        return x;
    }

    // Accessor method for y.
    public double getY() {
        return y;
    }

    // Mutator method for x.
    public void setX(double newX) {
        x = newX;
    }

    // Mutator method for y.
    public void setY(double newY) {
        y = newY;
    }

    @Override
    public int compareTo(Point o) {

        double distanceP1 = (getX() * getX()) + (getY() * getY());
        double distanceP2 = (o.getX() * o.getX()) + (o.getY() * o.getY());

        return Double.compare(distanceP1, distanceP2);
    }
}
