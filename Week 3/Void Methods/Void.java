public class Void{
    // This is the function that prints the number if it is grater than ten
    public static void gnum(Double x) {
        //if the parameter x is grater than ten then the number will print.
        if(x>10){
            // printing void function
            System.out.println(x);
        }
    }
    //main method
    public static void main(String[] args) {
        // numbers to plug in by the excersize.
        double num1 = .37;
        double num2 = 49;
        // function getting called
        gnum(num1);
        gnum(num2);
    }
}
