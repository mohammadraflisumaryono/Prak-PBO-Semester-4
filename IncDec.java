public class IncDec {
    public static void main(String args[]) {
        int a = 1, b = 9;
        System.out.println("Nilai sebelum increment-decrement");
        System.out.println("a=" + a + "; b = " + b);
        a = ++a;
        b = --b;
        System.out.println("Nilai setelah increment-decrement");
        System.out.println("a= " + a + "; b = " + b);
    }
}