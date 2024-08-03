import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Vehicle {
    private String model;
    private VehicleType type;
    private double pricePerDay;
    private List<Booking> bookings;
    public Vehicle(String model, VehicleType type, double pricePerDay) {
        this.model = model;
        this.type = type;
        this.pricePerDay = pricePerDay;
        this.bookings = new ArrayList<>();
    }
    public String getModel() {
        return model;
    }
    public VehicleType getType() {
        return type;
    }
    public double getPricePerDay() {
        return pricePerDay;
    }
    public List<Booking> getBookings() {
        return bookings;
    }
    public void addBooking(Booking booking) {
        bookings.add(booking);
    }
}
enum VehicleType {
    CAR, TRUCK, MOTORCYCLE, VAN
}
class Booking {
    private User user;
    private Vehicle vehicle;
    private LocalDate startDate;
    private LocalDate endDate;
    public Booking(User user, Vehicle vehicle, LocalDate startDate, LocalDate endDate) {
        this.user = user;
        this.vehicle = vehicle;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    public User getUser() {
        return user;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }
}
class User {
    private String name;
    public User(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class VehicleRentalSystem {
    private List<Vehicle> vehicles;
    private List<User> users;
    public VehicleRentalSystem() {
        this.vehicles = new ArrayList<>();
        this.users = new ArrayList<>();
    }
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
    public void addUser(User user) {
        users.add(user);
    }

    public boolean isVehicleAvailable(Vehicle vehicle, LocalDate startDate, LocalDate endDate) {
        for (Booking booking : vehicle.getBookings()) {
            if (booking.getEndDate().isAfter(startDate) && booking.getStartDate().isBefore(endDate)) {
                return false;
            }
        }
        return true;
    }
    public Vehicle findBestVehicle(VehicleType type, LocalDate startDate, LocalDate endDate, double maxPrice) {
        Vehicle bestVehicle = null;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getType() == type && vehicle.getPricePerDay() <= maxPrice && isVehicleAvailable(vehicle, startDate, endDate)) {
                if (bestVehicle == null || vehicle.getPricePerDay() < bestVehicle.getPricePerDay()) {
                    bestVehicle = vehicle;
                }
            }
        }
        return bestVehicle;
    }
    public void handleBookingInput(User user, Scanner scanner) {
        System.out.println("Enter vehicle type (CAR, TRUCK, MOTORCYCLE, VAN):");
        String typeInput = scanner.nextLine();
        VehicleType type = VehicleType.valueOf(typeInput.toUpperCase());
        System.out.println("Enter start date (yyyy-mm-dd):");
        String startDateInput = scanner.nextLine();
        LocalDate startDate = LocalDate.parse(startDateInput);
        System.out.println("Enter end date (yyyy-mm-dd):");
        String endDateInput = scanner.nextLine();
        LocalDate endDate = LocalDate.parse(endDateInput);
        System.out.println("Enter maximum price per day:");
        double maxPrice = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        Vehicle vehicle = findBestVehicle(type, startDate, endDate, maxPrice);
        if (vehicle != null) {
            if (isVehicleAvailable(vehicle, startDate, endDate)) {
                Booking booking = new Booking(user, vehicle, startDate, endDate);
                vehicle.addBooking(booking);
                System.out.println("Booking successful! Vehicle: " + vehicle.getModel() + " from " + startDate + " to " + endDate);
            } else {
                System.out.println("The selected vehicle is not available for the desired period.");
            }
        } else {
            System.out.println("No suitable vehicle found within your criteria.");
        }
    }
    public static void main(String[] args) {
        VehicleRentalSystem system = new VehicleRentalSystem();
        system.addVehicle(new Vehicle("Toyota Camry", VehicleType.CAR, 50));
        system.addVehicle(new Vehicle("Ford F-150", VehicleType.TRUCK, 70));
        system.addVehicle(new Vehicle("Harley Davidson", VehicleType.MOTORCYCLE, 40));
        system.addVehicle(new Vehicle("Dodge Caravan", VehicleType.VAN, 60));
        User user = new User("John Doe");
        system.addUser(user);
        Scanner scanner = new Scanner(System.in);
        system.handleBookingInput(user, scanner);
        scanner.close();
    }
}
