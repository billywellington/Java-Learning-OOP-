/**
 * Learning Objective: How abstraction works in OOP, using Java
 *
 * @author : Billy Wellington
 */
public class Abstraction {
    public static void main(String[] args) {
      //  Person person1 = new Person();
        Male male1 = new Male();
        male1.talk();

    }
}

abstract class Person{
    abstract void talk();
}

class Male extends Person{


    /**
     *
     */
    @Override
    void talk() {
        System.out.println("This guy talks!");

    }
}
