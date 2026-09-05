public class AutoBoxing {
    public static void main(String[] args) {
        int a=10;
        Integer b=Integer.valueOf(a); //Explicit Boxing
        System.out.println(b+" (Explicit Boxing)");
        //But From Java 5 it will we done automatically
        Integer c=a; //Auto Boxing
        System.out.println(c+" (Auto Boxing)");
        
    }
}
