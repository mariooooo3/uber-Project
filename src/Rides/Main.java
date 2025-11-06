
package Rides;

import Entitati.Driver;
import Entitati.Rider;
import Visitor.FinancialStatsVisitor;
import Visitor.StatisticsVisitor;

import static Entitati.Driver.contor;

public class Main {
    public static void main(String[] args) {
        Rider r = new Rider(new String[]{"Clapa", "Mario"}, 220);
        Driver d = new Driver(3, new String[]{"Clapa", "Mario"}, true, "Honda");
        Economic e = new Economic(d, r, 2, 4, 45, 0, false);
        Rides.chooseRide(r, d);
        FinancialStatsVisitor f = new FinancialStatsVisitor();
        d.accept(f);


    }
}
