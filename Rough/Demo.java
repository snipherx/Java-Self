import java.util.Scanner;
public class Demo {

    public static int div(int a,int b) throws ArithmeticException
    {
        return a/b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: -->");
        int a=sc.nextInt();
        System.out.print("Enter a another number: -->");
        int b=sc.nextInt();
        try
        {
            System.out.println(div(a, b));
        }
        catch(ArithmeticException e)
        {
            System.out.println("Invaild operation");
            System.out.println("Exception Occur: "+e.getMessage());
            System.out.println("Full Details: ");
            e.printStackTrace();;
        }
        finally
        {
            sc.close();
        }
        //System.out.println(div(a, b));
        System.out.println("Byee...");
    }
}