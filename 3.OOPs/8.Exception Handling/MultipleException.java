import java.util.Scanner;
public class MultipleException {
    static  void next()
    {
        System.out.println("-----------Next--------------");
    }

    static void checkAge(int age) throws IllegalArgumentException,ArithmeticException
    {
        if(age<0)
        {
            throw new IllegalArgumentException("Age cannot be negative"+age);
        }
        int result=100/age;
        System.out.println("100/age= "+result);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        try{
            System.out.print("Enter your age: ");
            int age=sc.nextInt();
            checkAge(age);
        }
        catch(IllegalArgumentException i)
        {
            next();
            System.out.println("Exception: "+i.getMessage());
            i.printStackTrace();
            next();
        }
        catch(ArithmeticException x)
        {
            next();
            System.out.println("Exception: "+x.getMessage());
            x.printStackTrace();
            next();
        }
    }
    
}
