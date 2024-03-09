public class Equality {
    public static void main(String[] args) {
        int x = 5;
        float f2 = 5.0F;
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 4, 5, 6 };
        int[] arr3 = arr1;
        String s1 = "hello", s2 = "hello";
        String s3 = s1;
        String s4 = new String("hello");
        /** Equality ******************************************************************/
        System.out.println();
        System.out.println("Equality operators: ");
        System.out.println("--------------------");
        System.out.println();
        System.out.println("\t      Equals: 5 = 5.0\t\t" + (x == f2));
        System.out.println("\t Not Equal: 5 != 5.0 \t\t" + (x != f2));
        System.out.println("\t      Equals: arr1 == arr2 \t" + (arr1 == arr2) + " [different array objects]");
        System.out.println("\t      Equals: arr1 == arr3 \t" + (arr1 == arr3) + "[ref to same array object]");
        System.out.println("\t Not Equal: arr1 != arr2 \t" + (arr1 != arr2));
        System.out.println("\t Not Equal: arr1 = arr3 \t " + (arr1 != arr3));
        System.out.println("\t Equals: s1 == s2 \t\t" + (s1 == s2) + "[same literal]");
        System.out.println("\t      Equals: si == s3 \t\t" + (s1 == s3) + "[same object reference]");
        System.out.println("\t      Equals: s1 == s4 \t\t" + (s1 == s4) + "[New object]");
    }
}
