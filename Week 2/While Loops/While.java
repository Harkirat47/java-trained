public class While {
    public static void main(String[] args) {
        int sixtyfour = 64;
        System.out.println(sixtyfour);
        while (sixtyfour%2 == 0) {
            sixtyfour = sixtyfour/2;
            System.out.println(sixtyfour);
        }   
    }
}
