import java.util.Scanner;

public class Check_Integer {
    public static void main(String[] args) {
        System.out.println("enter the integer");
        Scanner Sc = new Scanner(System.in);
       System.out.println("enter the integer value");
       if (Sc.hasNextInt()) {
        System.out.println("it is an integer number");
        
       } else {
        System.out.println("it is not integer value");
       }

    }
}
