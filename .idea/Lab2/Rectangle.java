import java.util.Scanner;

class Rectangle {

    double length;
    double breadth;
    double area;
    double perimeter;

    // Constructor
    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    // Calculate area and perimeter
    void calculate() {
        area = length * breadth;
        perimeter = 2 * (length + breadth);
    }

    // Display result
    void display() {
        System.out.println("Area of Rectangle = " + area);
        System.out.println("Perimeter of Rectangle = " + perimeter);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        // Create object using constructor
        Rectangle r = new Rectangle(l, b);

        // Calculate and display
        r.calculate();
        r.display();

        sc.close();
    }
}
