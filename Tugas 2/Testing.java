public class Testing {

    public static void main(String[] args) {
        char[] p = { 'a', 'b', 'c', 'd', 'e' };
        char[] x = upperCaseVersion(p);
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }

    public static char[] upperCaseVersion(char[] a) {
        int i;
        for (i = 0; i < a.length; i++) {
            a[i] = Character.toUpperCase(a[i]);
        }
        return a;
    }
}