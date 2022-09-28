import java.util.Scanner;
import java.lang.Math;

public class Homework {
    public static void main(String[] args) {
        double result;


        Scanner scanner = new Scanner(System.in);
        String[] array = new String[3];
        array[0] = "enter first number(if you are using sqrt/cbrt, first number is squared, seccond is multiplied)";
        array[1] = "enter operator";
        array[2] = "enter seccond number";
    
        for (int index = 0; index < 1; index++) {
            System.out.println(array[0]);
            Double numa = scanner.nextDouble();
            scanner.nextLine();

            System.out.println(array[1]);
            String operator = scanner.nextLine();

            System.out.println(array[2]);
            Double numb = scanner.nextDouble();
            scanner.nextLine();

            if(operator == "+"){
                result = numa + numb;
                System.out.println(result);
            }
            else if (operator == "-"){
                result = numa - numb;
                System.out.println(result);
            }
            else if(operator == "/"){
                result = numa / numb;
                System.out.println(result);
            }
            else if(operator == "*"){
                result = numa * numb;
                System.out.println(result);
            }
            else if(operator == "%"){
                result = numa % numb;
                System.out.println(result);
            }
            else if(operator == "^"){
                result = Math.pow(numa,numb);
                System.out.println(result);
            }
            else if(operator == "sqrt"){
                result = (Math.sqrt(numa)*numb);
                System.out.println(result);
            }
            else if(operator == "cbrt"){
                result = (Math.cbrt(numa)*numb);
                System.out.println(result);
            }
            else if(operator == "hypotnuse"){
                result = Math.hypot(numa, numb);
                System.out.println(result);
            }
            
        }
    
    }




    }
    

