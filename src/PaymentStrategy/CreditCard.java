package PaymentStrategy;

import java.util.Random;

import Entitati.Rider;

public class CreditCard implements PaymentStrategy {
    public int cardNo;
    Random random = new Random();
    int choice = random.nextInt(4);

    public CreditCard(int cardNo) {
        this.cardNo = cardNo;
    }

    public CreditCard() {
        this.init();
    }

    public void init() {
        switch (choice) {
            case 0:
                cardNo = 101;
                break;
            case 1:
                cardNo = 202;
                break;
            case 2:
                cardNo = 303;
                break;
            case 3:
                cardNo = 404;
                break;
            default:
                throw new IllegalArgumentException("Invalid");
        }
    }

    public void pay(Rider r) {
        System.out.println("Clientul " + r.firstName + " " + r.lastName +
                " a platit cursa folosind cardul:" + this.cardNo);
    }
}