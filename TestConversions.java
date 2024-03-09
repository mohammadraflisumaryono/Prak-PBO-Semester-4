class TestConversions {
    public static void main(String[] args) {
        /** Widening **/
        double d = 2.12345D;
        float f = 150.50F;
        long l = 15000L;
        int i = 55;
        char c = 20;
        short s = 1000;
        byte b = 126;
        // following compile ok
        System.out.println();
        System.out.println("Implicit Widening conversions:");
        System.out.println(". -");
        System.out.println(" byte to short: \t-> " + (s = b));
        System.out.println(" short to int: \t -> " + (i = s));
        System.out.println(" int to long: \t ->" + (l = 1));
        System.out.println(" long to float: \t -> " + (f = 1));
        System.out.println("float to double: \t->" + (d = f));
        // following compile ok with cast
        System.out.println();
        System.out.println("Explicit Widening conversions:");
        System.out.println("-----");
        System.out.println("cast byte to char: It ->" + (char) b);
        System.out.println("cast short to char: \t -> " + (char) s);
    }
}