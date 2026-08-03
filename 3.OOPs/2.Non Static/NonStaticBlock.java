public class NonStaticBlock {
    int a;
    {  //When we make object Non-static block automaticallt exicute
        System.out.println("It is Non-static block");
        System.out.println("Default value of a :"+a);
        a=53;
        System.out.println("After initializing 'a' inside Non-static block 'a'= "+a);
    }
    public static void main(String[] args) {
        NonStaticBlock x=new NonStaticBlock();
    }

}
