package javaassignment4;
/**
 *
 * @author Aufrichtig1
 */
public class Point {
/**
     * @param args the command line arguments
     */
    private double xCoordinate;
    private double yCoordinate;

    public Point(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public Point() {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }
    
    public Point(Point pnt)
    {
        xCoordinate = pnt.getxCoordinate();
        yCoordinate = pnt.getyCoordinate();
    }

    public double getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public double getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public String toString() {
        return getxCoordinate() + " , " + getyCoordinate();
    }

    public boolean equals(Point other) {
        if (other != null) {
            return xCoordinate == other.getxCoordinate() || yCoordinate == other.getyCoordinate();
        }
        else return false;
    }

    public double distanceTo(Point other) {
        double deltaX = xCoordinate - other.getxCoordinate();
        double deltaY = yCoordinate - other.getyCoordinate();
	double distance = Math.sqrt(deltaX * deltaX  +  deltaY * deltaY); 

        if (other != null) {
            return distance;
        }
        else return 0.0;
    }
}
