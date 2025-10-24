
package Entitati;

public class Main {
    public static void main(String[] args) {
        Rider rider = new Rider(new String[]{"Rapid", "Eficient"});
        rider.singUp();
        rider.singIn();
        System.out.println(rider);
        Driver driver = new Driver(3, new String[]{"Rapid", "Eficient"}, true, "Honda");
        driver.singUp();
        System.out.println(driver);
        rider.orderRide(driver);


    }
}
