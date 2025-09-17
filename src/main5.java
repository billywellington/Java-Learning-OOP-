/**
 * Program Name: main5
 * Description:
 * Author: Billy Wellington
 * Date: 17 September 2025
 * Language: Java
 */
public class main5 {
    public static void main(String[] args) {
        int x = 1, y = 4;

        System.out.println(sum(x, y));
    }
    static int sum(int num1, int num2) {

         int sum = 0;
         int i = 0;
         int ans;
        while (i < num2){
            sum += num1 + i;
        i++;
    }
        System.out.println(sum);
    if ((sum % 2) == 0) {
        return sum / 2;
    }
    else {
        return sum * 3;
    }
}
}
