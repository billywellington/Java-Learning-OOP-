/**
 *
 */
public class WrapperClasses {
    public static void main(String[] args) {
        int age = 20;
        Integer ageobj = age;


        System.out.println("Primitive:  " + age);
//        System.out.println("Year is " + ageobj.toString().concat("25"));
        Integer yearBorn = 2025 - ageobj;
        yearBorn = 2025 - age;
        System.out.println(yearBorn);
        System.out.println(yearBorn);



    }
}
