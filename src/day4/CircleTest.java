package day4;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] Args) {
        int radius = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the circle \n");
        radius = sc.nextInt();
        System.out.println("Diametre is " + Circle.CalcRadius(radius));
        System.out.println("Circumference is " + Circle.CalcCircumference(radius));
        System.out.println("Area is " + Circle.CalcArea(radius));
    }
}
