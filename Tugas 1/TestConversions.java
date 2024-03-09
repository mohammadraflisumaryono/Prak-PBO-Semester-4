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
        System.out.println("------------------------------");
        System.out.println(" byte to short : \t -> " + (s = b));
        System.out.println(" short to int : \t -> " + (i = s));
        System.out.println(" int to long : \t ->" + (l = i));
        System.out.println(" long to float : \t -> " + (f = l));
        System.out.println(" float to double : \t ->" + (d = f));
        // following compile ok with cast
        System.out.println();
        System.out.println("Explicit Widening conversions:");
        System.out.println("------------------------------");
        System.out.println("cast byte to char: \t ->" + (char) b);
        System.out.println("cast short to char: \t -> " + (char) s);

        /* Narrowing */
        d = 150.234256321235489645;
        System.out.println();
        System.out.println("Implicit Narrowing conversions:");
        System.out.println("------------------------------");
        System.out.println(" double to float : \t -> " + (f = (float) d));
        System.out.println(" float to long : \t -> " + (l = (long) f));
        System.out.println(" long to int : \t -> " + (i = (int) l));
        System.out.println(" int to short : \t -> " + (s = (short) i));
        System.out.println(" short to byte : \t -> " + (b = (byte) s));

    }
}