
package Entitati;

import Visitor.NotificationVisitor;
import Visitor.StatisticsVisitor;

public class Main {
    public static void main(String[] args) {
        Rider rider = new Rider(new String[]{"Clapa", "Mario"}, 100);
        rider.signUp();
        System.out.println(rider);
        Driver driver = new Driver(3, new String[]{"Clapa", "Mario"}, true, "Honda");
        driver.signUp();
//        System.out.println(driver);
//        rider.orderRide(driver);
        NotificationVisitor visitor = new NotificationVisitor();
        StatisticsVisitor s = new StatisticsVisitor();
        driver.accept(visitor);
        driver.accept(s);


    }
}
