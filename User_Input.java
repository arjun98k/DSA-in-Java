import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {
        System.out.println("enter the marks of 5 subject");
        Scanner Sc = new Scanner(System.in);
        int sub1 = Sc.nextInt();
        int sub2 = Sc.nextInt();
        int sub3 = Sc.nextInt();
        int sub4 = Sc.nextInt();
        int sub5 = Sc.nextInt();
        double result = ((double)(sub1+sub2+sub3+sub4+sub5)/500)*100;
        System.out.println("the answer of 5 subject " +result);
    }
}
