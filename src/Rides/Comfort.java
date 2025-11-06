package Rides;

import Entitati.Driver;
import Entitati.Rider;

import java.util.Random;

public class Comfort extends Rides {
    public boolean priorityDiver;
    public boolean wifi;
    public boolean drinks;
    public boolean snaks;
    public boolean sunVisor;

    public Comfort() {
        this.init();
    }

    public Comfort(boolean priorityDiver, boolean wifi, boolean drinks, boolean snaks,
                   boolean sunVisor, double price, double basePrice, int avgSpeed) {
        this.priorityDiver = priorityDiver;
        this.wifi = wifi;
        this.drinks = drinks;
        this.snaks = snaks;
        this.sunVisor = sunVisor;
        this.price = price;
        this.basePrice = basePrice;
        this.avgSpeed = avgSpeed;
    }

    public Comfort(Driver d, Rider r, double price, double basePrice, int avgSpeed, boolean priorityDiver,
                   boolean wifi, boolean drinks, boolean snaks, boolean sunVisor) {
        super(d, r, price, basePrice, avgSpeed);
        this.priorityDiver = priorityDiver;
        this.wifi = wifi;
        this.drinks = drinks;
        this.snaks = snaks;
        this.sunVisor = sunVisor;
    }

    public int luxury = 0;
    int luxuryFee = 0;


    public void calculateLuxury() {
        if (priorityDiver)
            luxury++;
        if (wifi)
            luxury++;
        if (drinks)
            luxury++;
        if (snaks)
            luxury++;
        if (sunVisor)
            luxury++;

    }

    public double addLuxuryFee() {
        calculateLuxury();
        if (luxury == 5)
            luxuryFee = 30;
        else if (luxury == 4)
            luxuryFee = 25;
        else if (luxury == 3)
            luxuryFee = 20;
        else if (luxury == 2)
            luxuryFee = 15;
        else if (luxury == 1)
            luxuryFee = 10;
        else
            luxuryFee = 0;

        return luxuryFee;
    }

    @Override
    public double calculatePrice() {
        if (addLuxuryFee() > 0)
            System.out.println("Se aplica luxury fee");
        else
            System.out.println("NU se aplica luxury fee");
        double pr = basePrice + (this.price * calculateDistance());
        pr = pr + addLuxuryFee();
        return pr;

    }

    public void init() {
        Random rand = new Random();
        this.priorityDiver = rand.nextBoolean();
        this.wifi = rand.nextBoolean();
        this.drinks = rand.nextBoolean();
        this.snaks = rand.nextBoolean();
        this.sunVisor = rand.nextBoolean();
        this.price = 6;
        this.basePrice = 30;
        this.avgSpeed = rand.nextInt(10) + 45;
    }

    @Override
    public String toString() {
        return super.toString() + ", iar informatiile cursei sunt:" + calculateDistance() + " km distanta parcursa," +
                " intr un interval de " + calculateTime() + " min,";
    }

}
