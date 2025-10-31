package Rides;

import Entitati.Driver;
import Entitati.Rider;

import java.util.Random;

public class Economic extends Rides {
    public int ecoDiscount;
    public boolean shareOption;

    public Economic()
    {
        this.init();
    }

    public Economic(int ecoDiscount, boolean shareOption, double price, double basePrice, int avgSpeed)
    {
        this.ecoDiscount = ecoDiscount;
        this.shareOption = shareOption;
        this.price = price;
        this.basePrice = basePrice;
        this.avgSpeed = avgSpeed;
    }

    public Economic(Driver d, Rider r, double price, double basePrice,
                    int avgSpeed, int ecoDiscount, boolean shareOption) {
        super(d, r, price, basePrice, avgSpeed);
        this.ecoDiscount = ecoDiscount;
        this.shareOption = shareOption;
    }

    public int applyDiscount() {
        return (ecoDiscount * 20) / 100;
    }

    public double shareRide() {
        int red;
        if (shareOption) {
            System.out.println("Se aplica reducere de share pentru clientul");
            red = 10;
        } else {
            System.out.println("Nu se aplica reducerea share");
            red = 0;
        }
        return red;
    }

    public double calculatePrice() {
        double pr = this.basePrice + (this.price * calculateDistance());
        pr = pr - applyDiscount();
        pr = pr - shareRide();
        return pr;
    }

    public void init()
    {
        Random rand = new Random();
        this.ecoDiscount = rand.nextInt(10) + 10;
        this.shareOption = rand.nextBoolean();
        this.price = 2;
        this.basePrice = 10;
        this.avgSpeed = rand.nextInt(10) + 45;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", iar informatiile cursei sunt:" + calculateDistance() + " km distanta parcursa," +
                " intr un interval de " + calculateTime() + " min,";
    }
}