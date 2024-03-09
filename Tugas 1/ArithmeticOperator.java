public class ArithmeticOperator {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Integer Division - results truncated:");
        System.out.println("");
        System.out.println("\t 10 / 3 \t = " + (10 / 3));
        System.out.println("\t 10 / -3 \t = " + (10 / -3));
        System.out.println("\t -10 / 3 \t = " + (-10 / 3));
        System.out.println();
        System.out.println("Floating-point division by 0: ");
        System.out.println(" ");
        System.out.println("\t 10.34 / 0 \t = " + (10.34 / 0));
        System.out.println("\t -10.34 / 0 \t = " + (-10.34 / 0));
        System.out.println("\t 10.34 / -0 \t = " + (10.34 / -0));
        System.out.println("\t 0.0 / 0 \t = " + (0.0 / 0));
        System.out.println("\t 0.0 / -0 \t = " + (0.0 / -0));
        System.out.println();
        System.out.println("Modulo operations: ");
        System.out.println(" ");
        System.out.println("\t 5 % 3 \t = " + (5 % 3));
        System.out.println("\t -5 % 3 \t = " + (-5 % 3));
        System.out.println("\t 5 % -3 \t = " + (5 % -3));
        System.out.println("\t 5.0 % 3 \t = " + (5.0 % 3));
        System.out.println("\t 5.0 % -3 \t = " + (5.0 % -3));
        System.out.println("\t -5.0 % 3 \t = " + (-5.0 % 3));
        System.out.println("\t 5.0 % 0 \t = " + (5.0 % 0));
    }
}