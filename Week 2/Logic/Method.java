import java.util.Scanner;
public class Method {
    static void teaParty(int tea,int candy) {
    if (tea > 5 && candy > 5) {
        if (2*(tea)>= candy) {
            System.out.println(2);
        }
        else if (2*(candy) >= tea){
            System.out.println(2);
        }
        else{
            System.out.println(1);
        }
    }
    else{
        System.out.println(0);
    }
  }
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.println("amount of tea");
         int tea = scanner.nextInt();
         scanner.nextLine();

         System.out.println("amount of candy");
         int candy = scanner.nextInt();
         scanner.nextLine();
         
         teaParty(tea, candy);
    }
}
