/**
 * Program Name: Car
 * Description:
 * Author: Billy Wellington
 * Date: 08 October 2025
 * Language: Java
 */
public class Car {
    String name;
    static int numberOfCars;

    Car(String car_name){
        this.name = car_name;
        numberOfCars ++;
        System.out.println(numberOfCars + "total cars created!");
    }

    static void parked(){
        System.out.println("This car is parked. It called a static method!");
    }
    void move(){
        System.out.println("This car is moving because it called a non-static method!");
    }

}
