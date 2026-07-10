import java.util.Scanner;

 public class Ride {
    private String customerName;
    private double distanceTravelled;
    private double pricePerKm;
    private double surgeMultiplier;

    // Setters
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setDistanceTravelled(double distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }

    public void setPricePerKm(double pricePerKm) {
        this.pricePerKm = pricePerKm;
    }

    public void setSurgeMultiplier(double surgeMultiplier) {
        this.surgeMultiplier = surgeMultiplier;
    }

    // Getters
    public String getCustomerName() {
        return customerName;
    }

    public double getDistanceTravelled() {
        return distanceTravelled;
    }

    public double getPricePerKm() {
        return pricePerKm;
    }

    public double getSurgeMultiplier() {
        return surgeMultiplier;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ride ride = new Ride();

        System.out.print("Enter Customer Name: ");
        ride.setCustomerName(sc.nextLine());

        System.out.print("Enter Distance Travelled (km): ");
        ride.setDistanceTravelled(sc.nextDouble());

        System.out.print("Enter Price Per Km: ");
        ride.setPricePerKm(sc.nextDouble());

        System.out.print("Enter Surge Multiplier: ");
        ride.setSurgeMultiplier(sc.nextDouble());

        double baseFare = ride.getDistanceTravelled() * ride.getPricePerKm();
        double finalFare = baseFare * ride.getSurgeMultiplier();

        // 10% discount if distance > 20 km
        if (ride.getDistanceTravelled() > 20) {
            finalFare = finalFare - (finalFare * 0.10);
        }

        // Add ₹50 service charge if surgeMultiplier > 1.5
        if (ride.getSurgeMultiplier() > 1.5) {
            finalFare += 50;
        }

        System.out.println("\nCustomer Name: " + ride.getCustomerName());
        System.out.println("Final Fare: ₹" + finalFare);
    }
}