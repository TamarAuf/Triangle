package javaassignment4;
/**
 *
 * @author Aufrichtig1
 */
public class Triangle {
    /**
     * @param args the command line arguments
     */
    Point vertexA = new Point();
    Point vertexB = new Point();
    Point vertexC = new Point();

    public Triangle() {
    }
    
    public Triangle(Point vA, Point vB, Point vC) {
        vertexA = new Point(vA);
        vertexB = new Point(vB);
        vertexC = new Point(vC);
    }

    private double sideA = vertexA.distanceTo(vertexB);
    private double sideB = vertexB.distanceTo(vertexC);
    private double sideC = vertexC.distanceTo(vertexA);
    private double s = ((sideA + sideB + sideC) / 2);

    public Point getvertexA() {
        Point retA = new Point(vertexA);
        return retA;
    }

    public void setvertexA(Point point) {
        vertexA = new Point(point);
    }

    public Point getvertexB() {
        Point retB = new Point(vertexB);
        return retB;
    }

    public void setvertexB(Point point) {
        vertexB = new Point(point);
    }

    public Point getvertexC() {
        Point retC = new Point(vertexC);
        return retC;
    }

    public void setvertexC(Point point) {
        vertexB = new Point(point);
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public double getS() {
        return s;
    }

    public double getArea() {
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    public boolean collinearTest(Point other1, Point other2, Point other3) {
        return (other1.getxCoordinate() == other2.getxCoordinate()
                && other1.getxCoordinate() == other3.getxCoordinate())
                || (other1.getyCoordinate() == other2.getyCoordinate()
                && other1.getyCoordinate() == other3.getyCoordinate());

    }
}
