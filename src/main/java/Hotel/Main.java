package Hotel;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Mariot", "Marszalkowska, 1", 1000, HotelType.CHAIN);
        Restaurant restaurant = new Restaurant("Lobby", LocalDate.ofEpochDay(365));
        Parking parking = new Parking("Underground", 100,50.00);
        Employee emp = new Employee("Adik", 22, "Marszalkowska, 2", 5000.00);
        Reception reception = new Reception(emp, LocalDate.now());
        Room president = new Room("President", "43rd floor", RoomType.LUXURY);
        Room family = new Room("Family one", "2nd floor", RoomType.FAMILY);

        PhoneNumber phoneNumber = new PhoneNumber("4812345567890");
        PhoneNumber phoneNumber1 = new PhoneNumber("4834243242334");

        Customer customer1 = new Customer("Adik", 45, "Marszalkowska, 3", "adik@adik.com");
        Customer customer11 = new Customer("Adik", 45, "Marszalkowska, 3", "adik@adik.com");
        Customer customer2 = new Customer("Adik2", 40, "Marszalkowska, 4", phoneNumber);
        Customer customer3 = new Customer("Adik3", 35, "Marszalkowska, 5", phoneNumber1, "adik3@adik3.com");

        if(customer1.equals(customer11)){
            System.out.println("Equals and hashCode is working");
        } else {
            System.err.println("Oops, equals and hashCode is not working");
        }
    }
}