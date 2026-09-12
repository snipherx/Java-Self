/**
 * Demo
 */
public class Demo {
    public String toString()
    {
        return a;
    }

    int a=10;
    void read()
    {
        System.out.println("No is -->"+a);
    }
    public static void main(String[] args) {
        Demo d=new Demo();
        d.read();
        System.out.println(d.toString());
    }
}