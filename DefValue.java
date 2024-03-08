public class DefValue{
static boolean b;
static int i;
static double d;
static long l;
static char c;
static float f;
static byte y;

public static void main(String[] args) {
DefValue val = new DefValue();
System.out.println("Default boolean :" + val.b);
System.out.println("Default integer :" + val.i);
System.out.println("Default double: " + val.d);
System.out.println("Default long:" + val.l); 
System.out.println("Default float: " + val.f);
System.out.println("Default byte : " + val.y);
System.out.println("Default char: "+ val.c); 
}
}