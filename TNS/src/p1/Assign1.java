package p1;

import java.util.Scanner;

// Abstract class Processor
abstract class Processor {
    protected int data;

    public void showData() {
        System.out.println("Data value: " + data);
    }

    public abstract void process(Scanner scanner);
}

// Factorial class
class Factorial extends Processor {
    @Override
    public void process(Scanner scanner) {
        System.out.print("Enter a number to calculate factorial: ");
        int num = scanner.nextInt();
        data = 1;
        for (int i = 1; i <= num; i++) {
            data *= i;
        }
        showData();
    }
}

// Circle class
class Circle extends Processor {
    @Override
    public void process(Scanner scanner) {
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        data = (int) (Math.PI * radius * radius);
        showData();
    }
}

// Main class
public class Assign1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Factorial");
            System.out.println("2. Circle Area");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1/2/3): ");
            int choice = scanner.nextInt();

            Processor processor = null;
            if (choice == 1) {
                processor = new Factorial();
                processor.process(scanner);
            } else if (choice == 2) {
                processor = new Circle();
                processor.process(scanner);
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
        scanner.close();
    }
}
