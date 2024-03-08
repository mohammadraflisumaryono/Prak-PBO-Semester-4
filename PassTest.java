public class PassTest {

    public static void changeInt(int value) {
        value = 55;
    }

    public static void changeObjectRef(MyData ref) {
        ref = new MyData(1, 1, 2000);
    }
    
    public static void changeObjectAttr(MyData ref) {
        ref.setDay(4);
    }
    
    public static void main(String[] args) {
        MyData date;
        int val;

        val = 11;
        changeInt(val);

        System.out.println("Int value is: " + val);

        date = new MyData(22, 7, 1964);
        changeObjectRef(date);
        date.printDate();

        changeObjectAttr(date);

        date.printDate();

                
    }
}