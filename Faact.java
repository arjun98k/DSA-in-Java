public class Faact {
    public static void main(String[] args) {
        int i=1; int fact = 1;
        int num = 5;

        while (i <= num) {
            fact = fact * i;
             i++;   
        }System.out.println("factorial of number"+" " +num +" is" + " "+ fact);
    }
}
