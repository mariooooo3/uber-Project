package Rides;

import Entitati.Driver;
import Entitati.Rider;

import java.util.Random;

public abstract class Rides {
    Driver d;
    Rider r;
    double price;
    double basePrice;
    int avgSpeed;

    public long startTime;
    public long stopTime;

    public Rides() {

    }

    public Rides(Driver d, Rider r, double price, double basePrice, int avgSpeed) {
        this.d = d;
        this.r = r;
        this.price = price;
        this.basePrice = basePrice;
        this.avgSpeed = avgSpeed;
    }

    public abstract double calculatePrice();

    public void startRide() {
        this.startTime = System.nanoTime();
    }

    public void stopRide() {
        Random rand = new Random();
        int rideMin = 10 + rand.nextInt(15);
        long rideNano = rideMin * 60L * 1_000_000_000;
        this.stopTime = this.startTime + rideNano;

    }

    public long calculateTime() {
        startRide();
        stopRide();
        long duration = this.stopTime - this.startTime;
        return duration / (60L * 1_000_000_000);
    }

    public long calculateDistance() {
        double hours = calculateTime() / 60.0;
        double distance = this.avgSpeed * hours;
        return Math.round(distance);
    }

    public static void chooseRide(Rider r, Driver d) {
        Rides ride;
        double ridePrice = 0;
        if (r.budget > 150) {
            ride = new Comfort();
            r.orderRide(d);
            ridePrice = ride.calculatePrice();
            d.earnings += ridePrice;
            r.spendings += ridePrice;
            System.out.println((Comfort)ride + " pretul este de: " + ridePrice);
        } else if (r.budget <= 150 && r.budget >= 100) {
            ride = new Regular();
            r.orderRide(d);
            ridePrice = ride.calculatePrice();
            d.earnings += ridePrice;
            r.spendings += ridePrice;
            System.out.println((Regular)ride + " pretul este de: " + ridePrice);
        } else if(r.budget < 100 && r.budget >= 30) {
            ride = new Economic();
            r.orderRide(d);
            ridePrice = ride.calculatePrice();
            d.earnings += ridePrice;
            r.spendings += ridePrice;
            System.out.println((Economic)ride + " pretul este de: " + ridePrice);
        }
        else
            System.out.println("Fonduri insufciente");


    }

    public String toString() {
        return ("Cursa este de tipul " + getClass());
    }



}
