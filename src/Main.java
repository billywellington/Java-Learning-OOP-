

public class Main {

    public static void main(String[] args) {
        Garage garage = new Garage();
        Car car = new Car("BMW");
        garage.park(car);

        Car car2 = new Car("Benz");
        garage.park(car2);


    }
}
