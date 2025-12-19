import java.util.Scanner;

// Box class
class Box {

    double length;
    double width;
    double height;

    Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    double volume() {
        return length * width * height;
    }
}

// Demo class (Application class)
class Demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        Box b = new Box(length, width, height);

        System.out.println("Volume = " + b.volume());

        sc.close();
    }
}
