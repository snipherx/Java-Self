public class TryCatch {
    public static void main(String[] args) {
        int i=10;
        //System.out.println(i/0);  //this line give Arithmeti Exception
        //To handle this exception we use try-catch
        try{
            System.out.println(i/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("i/0 is not possible");
        }

    }
}
