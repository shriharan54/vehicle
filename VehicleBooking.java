import java.util.Scanner;

class Vehicle {
    String regNo = "TN01AB1234";

    void book() {
        System.out.println("Vehicle booked successfully!");
    }
}

public class VehicleBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle v = new Vehicle();

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Available Vehicle: " + v.regNo);

        System.out.print("Book vehicle? (yes/no): ");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            v.book();
        } else {
            System.out.println("Booking cancelled.");
        }

        sc.close();
    }
}