package Rides;

import Entitati.Driver;
import Entitati.Rider;

import java.util.Random;

public class Regular extends Rides {
    public boolean preferedMusic;
    public boolean airConditioner;
    public int waitTime;

    public Regular() {
        this.init();
    }

    public Regular(boolean preferedMusic, boolean airConditioner, int waitTime,
                   double price, double basePrice, int avgSpeed) {
        this.preferedMusic = preferedMusic;
        this.airConditioner = airConditioner;
        this.waitTime = waitTime;
        this.price = price;
        this.basePrice = basePrice;
        this.avgSpeed = avgSpeed;
    }

    public Regular(Driver d, Rider r, double price, double basePrice, int avgSpeed,
                   boolean preferedMusic, boolean airConditioner, int waitTime) {
        super(d, r, price, basePrice, avgSpeed);
        this.preferedMusic = preferedMusic;
        this.airConditioner = airConditioner;
        this.waitTime = waitTime;
    }

    int comfort = 0;
    int comfortFee = 0;

    public int addComfortFee() {
        calculateComfort();
        if (comfort == 3)
            comfortFee = 15;
        else if (comfort == 2)
            comfortFee = 10;
        else if (comfort == 1)
            comfortFee = 5;
        else
            comfortFee = 0;

        return comfortFee;
    }

    public void calculateComfort() {
        if (preferedMusic)
            comfort++;
        if (airConditioner)
            comfort++;
        if (waitTime < 5)
            comfort++;

    }

    public double calculatePrice() {
        if (addComfortFee() > 0)
            System.out.println("Se aplica regular fee");
        else
            System.out.println("NU se aplica regular fee");
        double pr = this.basePrice + (this.price * calculateDistance());
        pr = pr + addComfortFee();
        return pr;
    }

    public void init() {
        Random rand = new Random();
        this.airConditioner = rand.nextBoolean();
        this.preferedMusic = rand.nextBoolean();
        this.waitTime = rand.nextInt(10);
        this.price = 4;
        this.basePrice = 15;
        this.avgSpeed = rand.nextInt(10) + 45;

    }

    @Override
    public String toString() {
        return super.toString() + ", iar informatiile cursei sunt:" + calculateDistance() + " km distanta parcursa," +
                " intr un interval de " + calculateTime() + " min,";
    }
}
