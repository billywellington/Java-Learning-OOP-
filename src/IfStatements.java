import java.util.Random;

public class IfStatements {
    public static void main(String[] args) {

        Random random = new Random();

        int age = random.nextInt(50) +1;

        if (age >= 1 && age <= 2){
            System.out.println("Age: " + age);
            System.out.println("You are a Baby");
        }
        else if (age > 2 && age <= 4){
            System.out.println("Age: " + age);
            System.out.println("Toddler");
        }
        else if (age > 4 && age <= 9){
            System.out.println("Age: " + age);
            System.out.println("Child");
        }
        else if (age > 9 && age <= 12){
            System.out.println("Age: " + age);
            System.out.println("Pre-Teen");
        }
        else if (age > 12 && age <= 19){
            System.out.println("Age: " + age);
            System.out.println("Teen");
        }
        else if (age > 19 && age <= 24){
            System.out.println("Age: " + age);
            System.out.println("Young Adult");
        }
        else if (age > 24 ){
            System.out.println("Age: " + age);
            System.out.println("Adult");
        }

    }
}
