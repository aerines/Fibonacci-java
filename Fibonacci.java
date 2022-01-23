import java.util.Scanner;

class Fibonacci {
    public static void main (String[] args) {
        int number, x = 0, y = 0, z = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the lenght of the Fibonacci");
        number = in.nextInt();
        for (int i=0; i<number; i++) {
            x = y;
            y = z;
            z = x+y;
            System.out.println(x + "");
        }
        
    }
}