package Entitati;

import PaymentStrategy.*;

import java.util.Arrays;
import java.util.Random;

public class Rider extends Account {
    String[] ridePreferences;

    public Rider() {

    }

    public Rider(String username, String password, String lastName, String firstName, String[] ridePreferences) {
        super(username, password, lastName, firstName);
        this.ridePreferences = ridePreferences;
    }

    public Rider(String[] ridePreferences) {
        this.ridePreferences = ridePreferences;
    }

    public void orderRide(Driver d) {
        int contor = 0;
        for (int i = 0; i < ridePreferences.length; i++) {
            for (int j = 0; j < d.qualities.length; j++) {
                if (ridePreferences[i].equals(d.qualities[j]))
                    contor++;
            }
        }
        if (contor >= 2)
            d.acceptRide(this);
        else
            cancelOrder(d);
    }

    public void cancelOrder(Driver d) {
        d.getRate();
        if(d.rating < 3.6)
            System.out.println("Calatorul " + this.firstName + " " + this.lastName +
                    " a refuzat cursa soferului " + d.firstName + " " + d.lastName);
    }

    @Override
    public String toString() {
        return super.toString() + "de tipul rider, avand urmatoarele preferinte: " + Arrays.toString(this.ridePreferences);
    }

    @Override
    public void getRate() {
        super.getRate();
        System.out.printf("Rating-ul calatorului %s %s este: %.2f/5%n", this.firstName, this.lastName, this.rating);

    }

    public void getPaymentMethod(Rider r) {
        Random rand = new Random();

        int choice = rand.nextInt(4);
        PaymentStrategy pay;

        switch (choice) {
            case 0:
                pay = new Cash();
                break;
            case 1:
                pay = new CreditCard();
                break;
            case 2:
                pay = new Voucher();
                break;
            case 3:
                pay = new Revolut();
                break;
            default:
                throw new IllegalArgumentException("Invalid");
        }
        pay.pay(r);


    }


}