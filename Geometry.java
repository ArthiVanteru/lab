import java.util.Scanner;

class Geometry {
    public static double calculateAoR(double length, double width) {
        return length * width;
    }

    public static double calculateAoC(double radius) {
        return  radius * radius*3.14;
    }

    public static double calculateVoB(double length, double width, double height) {
        return length * width * height;
    }
}

public class GeometryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geometry Calculator\n");
        System.out.println("1. Calculate area of a rectangle");
        System.out.println("2. Calculate area of a circle");
        System.out.println("3. Calculate volume of a box");
        System.out.println("4. Exit");

        while (true) {
            System.out.print("\nEnter your choice (1-4): ");
            int c = scanner.nextInt();

            if (c == 1) {
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                double area = Geometry.calculateAoR(length, width);
                System.out.println("The area of the rectangle is: " + area);
            } else if (c == 2) {
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                double area = Geometry.calculateAoC(radius);
                System.out.println("The area of the circle is: " + area);
            }  else if (c == 3) {
                System.out.print("Enter the length of the box: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the box: ");
                double width = scanner.nextDouble();
                System.out.print("Enter the height of the box: ");
                double height = scanner.nextDouble();
                double volume = Geometry.calculateVoB(length, width, height);
                System.out.println("The volume of the box is: " + volume);
            }else  if (c == 4) {
                System.out.println("Exiting the program...");
                break;
            } else {
                System.out.println("Invalid choice. Please enter a number from 1-4.");
            }
        }
    }
}
