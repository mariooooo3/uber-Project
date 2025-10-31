package Visitor;

import Entitati.Driver;
import Entitati.Rider;

public class NotificationVisitor implements Visitor {
    public void visit(Driver d) {
        System.out.println("!!!EXCLUSIV IN ACEASTA SAPTAMANA" +
                " fiecare sofer primeste un bonus de 20%!!!");
    }

    public void visit(Rider r) {
        System.out.println("Bune venit, primele 3 curse au discount 20%, nu rata oferta!!");
    }
}
