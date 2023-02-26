import java.util.Arrays;
import java.util.Scanner;

public class BusExpress {
    public static void main(String[] args) {
        String[] seats = new String[10];
        Arrays.fill(seats, "available");
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Available seats: " + Arrays.toString(seats));
            System.out.print("Select an operation (reserve/cancel/exit): ");
            String operation = scanner.nextLine();
            
            if (operation.equals("reserve")) {
                System.out.print("Enter seat number: ");
                int seat = Integer.parseInt(scanner.nextLine());
                
                if (seats[seat-1].equals("available")) {
                    seats[seat-1] = "reserved";
                    System.out.println("Seat " + seat + " has been reserved.");
                } else {
                    System.out.println("Error: Seat " + seat + " is already reserved.");
                }
            } else if (operation.equals("cancel")) {
                System.out.print("Enter seat number: ");
                int seat = Integer.parseInt(scanner.nextLine());
                
                if (seats[seat-1].equals("reserved")) {
                    seats[seat-1] = "available";
                    System.out.println("Seat " + seat + " has been cancelled.");
                } else {
                    System.out.println("Error: Seat " + seat + " is not reserved.");
                }
            } else if (operation.equals("exit")) {
                break;
            } else {
                System.out.println("Error: Invalid operation.");
            }
        }
        
        scanner.close();
    }
}
