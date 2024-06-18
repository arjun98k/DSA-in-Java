public class Operator_logic {

    public static boolean CheckSecondCondition(){
        System.out.println("second condition is evaluated");
        return true;
    }
    public static void main(String[] args) {
        boolean cond_1 = true;
        boolean cond_2 = CheckSecondCondition();

        // Bitwise Or

        if (cond_1 | cond_2){
            System.out.println("at least one condtion is true");
        }
        
    }
}
