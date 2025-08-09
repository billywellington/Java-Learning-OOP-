//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int age_b, age_k, temp, year, birthYearB, birthYearK;
        birthYearB = 1992;
        birthYearK = 1998;
        year = 2025;
        age_b = year - birthYearB;
        age_k = year - birthYearK;

        System.out.println("Billy Wellington is " + age_b + " years old.");
        System.out.println("Kay Wellington is " + age_k + "years old.");

        temp = age_b;
        age_b = age_k;
        age_k = temp;

        System.out.println("******* This is after swapping the ages! *******");

        System.out.println("Billy Wellington is " + age_b + " years old.");
        System.out.println("Kay Wellington is " + age_k + "years old.");

    }
}