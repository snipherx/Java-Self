public class NonParamaterizedConstructor {
    String msg="-------------Bye---------------";
    NonParamaterizedConstructor()
    {
        System.out.println("This message run when we use this constructor to make object");
    }
    public static void main(String[] args) {
        NonParamaterizedConstructor a=new NonParamaterizedConstructor();
        System.out.println(a.msg);
    }
    
}
