package javaassignment4;

import java.util.Scanner;
import java.io.*;

//Order in file should be xCoordinate of 1st point, y of 1st, x of 2nd, y of 2nd...
public class TriangleExerciser {

    public static void main(String[] args) {

        Triangle triangle = new Triangle();

        try {

            Scanner kybd = new Scanner(System.in);
            String filename = kybd.nextLine();
            File file = new File(filename);
            Scanner inputFile = new Scanner(file);

            triangle.vertexA.setxCoordinate(inputFile.nextDouble());
            triangle.vertexA.setyCoordinate(inputFile.nextDouble());
            triangle.vertexB.setxCoordinate(inputFile.nextDouble());
            triangle.vertexB.setyCoordinate(inputFile.nextDouble());
            triangle.vertexC.setxCoordinate(inputFile.nextDouble());
            triangle.vertexC.setyCoordinate(inputFile.nextDouble());

            inputFile.close();

            if (!triangle.collinearTest(triangle.getvertexA(), triangle.getvertexB(), triangle.getvertexC())) {

                triangle.getArea();

                triangle.getPerimeter();
            } else {
                System.out.println("TriangleError. The three points do not form a triangle. ");

            }
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}
