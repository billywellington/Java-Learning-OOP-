import java.util.Locale;

public class MathClass {
    public static void main(String[] args) {
        double x = 2.4, y = 2.3;
        double z;

//        z = Math.abs(y);
//        System.out.println("The absolute value of y is " + z);

//        z = Math.sqrt(x);
//        System.out.println("The square root of x is " + z);

//        z = Math.ceil(x);
//        System.out.println("The ceiling value of x is " + z);

//        z = Math.floor(x);
//        System.out.println("The floor value of x is " + z);

        //finding the hypotenuse of a triangle using the pythagoras theorem
          z = Math.sqrt((x*x) + (y*y));
          System.out.printf("The hypotenuse value, z, is %.2f\n", z);

          double w =  12335235.54263;
        System.out.printf(Locale.CHINA, "the number ,W, is %,.2f", w);







    }
}
