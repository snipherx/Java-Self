public class AutoUnboxing {
    public static void main(String[] args) {
        Integer a=10;
        /*
        We can also write like this
        -Integer a=new Integer(10);
        -Integer a=Integer.valueOf(10);
        But From java 5 it will done automatically
        */
        int b=a; //Auto Unboxing
        System.out.println(b+" (Auto UnBoxing)");
    }
}
