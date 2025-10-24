package PaymentStrategy;

import Entitati.Rider;

public interface PaymentStrategy {
    public void pay(Rider r);

    public void init();
}