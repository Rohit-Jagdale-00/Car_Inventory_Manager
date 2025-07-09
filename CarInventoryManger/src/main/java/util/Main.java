package util;

import java.sql.Date;
import java.util.Scanner;

import dao.BookingDAO;
import dao.CarDAO;
import dao.CustomerDAO;
import dao.ServiceRecordDAO;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
       while (true) {
          System.out.println("\n--- 🚗 Car Inventory Manager Menu 🚗---");
          System.out.println("1. Add Car");
          System.out.println("2. View All Cars");
          System.out.println("3. Add Customer");
          System.out.println("4. View All Customers");
          System.out.println("5. Add Booking");
          System.out.println("6. View All Bookings");
          System.out.println("7. Add Service Record");
          System.out.println("8. View All Service Records");
          System.out.println("9. Delete a Booking");
          System.out.println("10. Exit");
          System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
      
         case 1:
              System.out.print("Enter Car ID: "); int carId = sc.nextInt();
              sc.nextLine();
              System.out.print("Enter Make: "); String make = sc.nextLine();
              System.out.print("Enter Model: ");String model = sc.nextLine();
              System.out.print("Enter Price: ");double price = sc.nextDouble();
              sc.nextLine();
              System.out.print("Enter Status: ");String status = sc.nextLine();
              System.out.print("Enter Year: ");int year = sc.nextInt();
              CarDAO.addCar(carId, make, model, price, status, year);
              break;

        case 2:CarDAO.getAllCars();break;

        case 3:
               System.out.print("Enter Customer ID: ");int custId = sc.nextInt();
               sc.nextLine();
               System.out.print("Enter Name: ");String name = sc.nextLine();
               System.out.print("Enter Email: "); String email = sc.nextLine();
               System.out.print("Enter Phone: ");String phone = sc.nextLine();
               System.out.print("Enter Address: "); String address = sc.nextLine();
               CustomerDAO.addCustomer(custId, name, email, phone, address);
               break;

         case 4: CustomerDAO.getAllCustomer();break;

         case 5:
               System.out.print("Enter Booking ID: "); int bookingId = sc.nextInt();
               System.out.print("Enter Car ID: "); int bCarId = sc.nextInt();
               System.out.print("Enter Customer ID: ");int bCustId = sc.nextInt();
               sc.nextLine();
               System.out.print("Enter Booking Date (yyyy-mm-dd): ");Date bookingDate = Date.valueOf(sc.nextLine());
               System.out.print("Enter Return Date (yyyy-mm-dd): "); Date returnDate = Date.valueOf(sc.nextLine());
               System.out.print("Enter Status: ");String bStatus = sc.nextLine();
               BookingDAO.addBookings(bookingId, bCarId, bCustId, bookingDate, returnDate, bStatus);
               break;

         case 6: BookingDAO.getAllBookings(); break;

         case 7:
                System.out.print("Enter Service Record ID: "); int recordId = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Service Date (yyyy-mm-dd): ");Date serviceDate = Date.valueOf(sc.nextLine());
                System.out.print("Enter Description: ");String description = sc.nextLine();
                System.out.print("Enter Cost: ");double cost = sc.nextDouble();
                ServiceRecordDAO.addService(recordId, serviceDate, description, cost);
                break;

         case 8:ServiceRecordDAO.getAllServices();    break;
           
         case 9:
        	   System.out.println("Enter Booking id to Delete a Booking"); int bookid=sc.nextInt();
        	   BookingDAO.deleteBooking(bookid);
        	 
         case 10:System.out.println("Exiting program...");break;
                    
                default:System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
