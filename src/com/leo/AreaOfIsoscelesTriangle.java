package com.leo;

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.print is used to keep the cursor on the same line after printing the prompt
        System.out.print("Enter the base of the isosceles triangle: "); //prompt to input the base of the triangle
        double base = in.nextDouble(); // reads the input as double

        System.out.print("Enter the height of the isosceles triangle: "); //prompt for the height of the isosceles triangle
        double height = in.nextDouble();

        // Area = 0.5 x base x height

        double area = 0.5 * base * height;
        System.out.println("The area of the isosceles triangle is :" + area);

        in.close();
    }
}
