public class StaticBlock {
    static int a;
    static  //Static block
    {
        a=2*5+5;   //Initialize value inside static block
        a=a+5;
    }
    public static void main(String[] args) {
        System.out.println(a);
    }
    
}
