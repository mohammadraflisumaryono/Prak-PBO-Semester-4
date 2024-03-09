class TestLogical {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = false;
        boolean d = false;

        System.out.println();
        System.out.println("Logical Operators:");
        System.out.println("------------------");
        System.out.println();
        System.out.println("\t true & true = \t" + (a & b));
        System.out.println("\t true & false = \t" + (a & c));
        System.out.println("\t true ^ false = \t" + (a ^ c));
        System.out.println("\t true ^ true = \t" + (a ^ b));
        System.out.println("\t true | false = \t" + (a | b));
        System.out.println("\t false | false = \t" + (c | d));
        System.out.println();
        System.out.println("\t true && true = \t" + (a && b));
        System.out.println("\t false && true = \t" + (c && a));
        System.out.println();
        System.out.println("\t false || true = \t" + (c || a));
        System.out.println("\t false || false = \t" + (c || d));
        System.out.println("\t true || false = \t" + (a || d));
        System.out.println("\t true || true = \t" + (a || b));
    }
}