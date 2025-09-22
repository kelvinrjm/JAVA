import java.util.Scanner;
public class a5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Area Calculator ---");
            System.out.println("1. Calculate area of a Rectangle");
            System.out.println("2. Calculate area of a Triangle");
            System.out.println("3. Calculate area of a Circle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the length of the rectangle: ");
                    int length = scanner.nextInt();
                    System.out.print("Enter the width of the rectangle: ");
                    int width = scanner.nextInt();
                    Rectangle rectangle = new Rectangle(length, width);
                    rectangle.printArea();
                    break;

                case 2:
                    System.out.print("Enter the base of the triangle: ");
                    int base = scanner.nextInt();
                    System.out.print("Enter the height of the triangle: ");
                    int height = scanner.nextInt();
                    Triangle triangle = new Triangle(base, height);
                    triangle.printArea();
                    break;

                case 3:
                    System.out.print("Enter the radius of the circle: ");
                    int radius = scanner.nextInt();
                    Circle circle = new Circle(radius);
                    circle.printArea();
                    break;

                case 4:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice Please enter a number between 1 and 4.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
