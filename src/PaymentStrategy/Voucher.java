package PaymentStrategy;

import java.util.Random;

import Entitati.Rider;

public class Voucher implements PaymentStrategy {
    public int voucherNo;
    Random random = new Random();
    int choice = random.nextInt(4);

    public Voucher(int voucherNo) {
        this.voucherNo = voucherNo;
    }

    public Voucher() {
        this.init();
    }

    public void init() {
        switch (choice) {
            case 0:
                voucherNo = 999;
                break;
            case 1:
                voucherNo = 888;
                break;
            case 2:
                voucherNo = 777;
                break;
            case 3:
                voucherNo = 666;
                break;
            default:
                throw new IllegalArgumentException("Invalid");
        }
    }

    public void pay(Rider r) {
        System.out.println("Clientul " + r.firstName + " " + r.lastName +
                " a platit cursa cu voucher-ul: " + voucherNo);
    }

}
