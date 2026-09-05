public class Throw {
    public static int div(int a,int b) throws ArithmeticException
    {
        return a/b;
    }
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");
        try{
            System.out.println(div(10, 0));
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception: "+e.getMessage());
            e.printStackTrace();
        }
    }

}
