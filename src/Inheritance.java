/**
 *
 */
public class Inheritance {
    public static void main(String[] args) {

        Train myTrain = new Train();

        myTrain.move();
        myTrain.stop();

    }
}


class Vehicles{
    int doors;
    double speed;

    void move(){
        System.out.println("This vehicle is moving!");
    }
    void stop(){
        System.out.println("This vehicle is stopping!");
    }
}

class Train extends Vehicles {
    @Override
    void move() {
        System.out.println("This train is moving!");

    }

    @Override
    void stop() {
        System.out.println("This train is stopping!");

    }
}
