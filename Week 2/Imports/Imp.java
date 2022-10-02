import java.util.Scanner;
import java.lang.Math;

public class Imp {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Double rand = Math.random();
        Double randa = rand*100;
        Double actrand = Math.floor(randa);
        Double placeholder = 3 - 3.1;

        System.out.println("number please");
        double guess = scanner.nextDouble();
        scanner.nextLine();


        for (int index = 0; index < 4; index++) {
            if ((guess - actrand )== 0) {
                System.out.println("u win");
                index = index + 5;
            }
            else if (guess - actrand < placeholder ) {
                System.out.println("too low, guess again");
                guess = scanner.nextDouble();
                scanner.nextLine();
            }
            else if (guess - actrand > 0.1 ) {
                System.out.println("too high, guess again");
                guess = scanner.nextDouble();
                scanner.nextLine();
            }
            if(index == 3){
                System.out.println("u lost");
                System.out.println("The correct answer was :" + actrand);
            }

        }

    }
}
