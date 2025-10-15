/**
 * Program Name: Static
 * Description:
 * Author: Billy Wellington
 * Date: 08 October 2025
 * Language: Java
 */
public class Static {
    public static void main(String[] args) {

        Car car1 = new Car("BMW");
        Car car2 = new Car("VW Golf");

        Car car3 = new Car("Tesla");
        Car car4 = new Car("Mini Cooper");

        car1.move();
        Car.parked();
        System.out.println("There are a total of "+ Car.numberOfCars + " cars!");

    }
}
