public class Parent {
    static int a=23;
    static int b=32;
    static int sum=a+b;
    public static void add()
    {
        System.out.println(a+"+"+b+"= Sum is "+sum);
    }
    public static void main(String[] args) {
        //Use static variable and variable directly in this class
        System.out.println("static variable a:"+a);
        System.out.println("static variable b:"+b);
        add();
    }
}
