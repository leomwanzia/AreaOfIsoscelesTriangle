# AreaOfIsoscelesTriangle

Explanation:
Import Scanner Class:

java

    import java.util.Scanner;
    
This line imports the Scanner class from the java.util package. The Scanner class is used to read input from the user.

**Declare Main Class:**

java

    **public class AreaOfIsoscelesTriangle {**
    
This line declares a public class named AreaOfIsoscelesTriangle. In Java, every program must have at least one class, and the class name should match the file name (e.g., AreaOfIsoscelesTriangle.java).

**Declare Main Method:**

java

    **public static void main(String[] args) {**
    
This line declares the main method, which is the entry point of the program. The public keyword means that the method can be accessed from outside the class. The static keyword means that the method belongs to the class rather than an instance of the class. The void keyword means that the method does not return any value. The main method takes an array of strings (String[] args) as a parameter, which can be used to pass command-line arguments to the program.

Create Scanner Object:

java

    **Scanner in = new Scanner(System.in);**
    
This line creates a new Scanner object named in that is used to read input from the standard input (usually the keyboard).

Input Base:

java

    **System.out.print("Enter the base of the isosceles triangle: ");**
    **double base = in.nextDouble();**

This block prompts the user to enter the base of the isosceles triangle and reads the input as a double. The System.out.print method is used instead of System.out.println to keep the cursor on the same line after printing the prompt.

**Input Height:**

java

    **System.out.print("Enter the height of the isosceles triangle: ");
    double height = in.nextDouble();**
    
This block prompts the user to enter the height of the isosceles triangle and reads the input as a double.

**Calculate Area:**

java

    double area = 0.5 * base * height;
This line calculates the area of the isosceles triangle using the formula 
Area
=
1
2
×
base
×
height
Area= 
2
1
​
 ×base×height. The result is stored in the area variable.

Output Result:

java

    **System.out.println("The area of the isosceles triangle is: " + area);**

This line prints the calculated area to the console. The System.out.println method is used to print the string and move the cursor to the next line. The + operator is used to concatenate the string with the value of the area variable.

Close Scanner:

java

    **in.close();**
This line closes the Scanner object to free up system resources. It is a good practice to close the Scanner when you are done with it.

