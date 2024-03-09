public class Relational {
    public static void main(String[] args) {
        int x = 5, y = 6, z = 5;
        float f0 = 0.0f, f1 = -0.0f, f2 = 5.0f;
        System.out.println();
        System.out.println("Relational operators: ");
        System.out.println(" ");
        System.out.println();
        System.out.println("Less than: 5 < 6 \t\t" + (x < y));
        System.out.println("Less than or equal to: 5 <= 6 \t\t" + (x <= z));
        System.out.println("Greater than: 5 > 6 \t\t" + (x > y));
        System.out.println("Greater than equal to: 5 >= 5 \t\t" + (x >= z));
        System.out.println();
        System.out.println("Less than: -0.0 < 0.0 \t\t" + (f1 < f0));
        System.out.println("Less than or equal to: -0.0 <= 0.0 \t\t" + (f1 <= f0));
        System.out.println("Greater than: 5 > NaN \t\t" + (x > (f0 / f1)));
    }
}
