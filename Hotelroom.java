package Roomreserve;
import java.util.Scanner;
public class Hotelroom {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    
	        int hotel[][] = new int[7][5]; // 7 floors, 5 rooms
	        int choice;

	        while (true) {
	            System.out.println("\n=== HOTEL RESERVATION SYSTEM ===");
	            System.out.println("1. View Rooms");
	            System.out.println("2. Check In");
	            System.out.println("3. Check Out");
	            System.out.println("4. Exit");
	            System.out.print("Enter choice: ");
	            choice = sc.nextInt();

	            if (choice == 1) {
	                // VIEW ROOMS
	                for (int i = 6; i >= 0; i--) {
	                    System.out.print("Floor " + (i + 1) + ": ");
	                    for (int j = 0; j < 5; j++) {
	                        System.out.print("[" + hotel[i][j] + "]");
	                    }
	                    System.out.println();
	                }

	            } else if (choice == 2) {
	                // CHECK IN
	                System.out.print("Enter floor (1-7): ");
	                int floor = sc.nextInt();

	                System.out.print("Enter room (1-5): ");
	                int room = sc.nextInt();

	                if (hotel[floor - 1][room - 1] == 0) {
	                    hotel[floor - 1][room - 1] = 1;
	                    System.out.println("Check-in successful!");
	                } else {
	                    System.out.println("Room already occupied.");
	                }

	            } else if (choice == 3) {
	                // CHECK OUT
	                System.out.print("Enter floor (1-7): ");
	                int floor = sc.nextInt();

	                System.out.print("Enter room (1-5): ");
	                int room = sc.nextInt();

	                if (hotel[floor - 1][room - 1] == 1) {
	                    hotel[floor - 1][room - 1] = 0;
	                    System.out.println("Check-out successful!");
	                } else {
	                    System.out.println("Room already empty.");
	                }

	            } else if (choice == 4) {
	                System.out.println("Exiting program...");
	                break;
	            } else {
	                System.out.println("Invalid choice.");
	            }
	        }
	    }
	}