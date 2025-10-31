package Entitati;

import Visitor.Visitable;
import Visitor.Visitor;
import Rides.Rides;

public class Driver extends Account implements Visitable {
    public int experience;
    public String[] qualities;
    public boolean isAvailable;
    public String carModel;
    public double earnings = 0;

    public Driver() {

    }

    public Driver(String username, String password, String lastName,
                  String firstName, int experience, String[] qualities, boolean isAvailable) {
        super(username, password, lastName, firstName);
        this.experience = experience;
        this.qualities = qualities;
        this.isAvailable = isAvailable;
    }

    public Driver(int experience, String[] qualities, boolean isAvailable, String carModel) {
        this.experience = experience;
        this.qualities = qualities;
        this.isAvailable = isAvailable;
        this.carModel = carModel;
    }

    public void acceptRide(Rider r) {
        r.getRate();
        if (this.isAvailable && r.rating > 3.6) {
            System.out.println("Soferul " + firstName + " " + lastName + " cu masinca marca:"
                    + carModel + " a acceptat cursa calatorului: " + r.firstName + " " + r.lastName);
            r.getPaymentMethod(r);
        } else
            declineRide(r);
    }

    public void declineRide(Rider r) {
        r.getRate();
        if (!this.isAvailable && r.rating < 3.6)
            System.out.println("Soferul " + firstName + " " + lastName + " cu masinca marca:"
                    + carModel + " a refuzat cursa calatorului: " + r.firstName + " " + r.lastName);
    }

    @Override
    public String toString() {
        return super.toString() + "de tipul driver, are " +
                this.experience + " ani de experiemta si o masina marca: " + this.carModel;
    }

    @Override
    public void getRate() {
        super.getRate();
        System.out.printf("Rating-ul soferului %s %s este: %.2f/5%n", this.firstName, this.lastName, this.rating);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }


}
