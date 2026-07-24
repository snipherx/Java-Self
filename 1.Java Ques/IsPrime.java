//Check Number is Prime or not.
import java.util.Scanner;
public class IsPrime {
    public static boolean isPrime(int num)
    {
        boolean prime=true;
        int check=0;
        for(int i=2;i<num/2;i++)
        {
            if(num%i==0)
            {
                check+=1;
            }
        }
        if(check>0)
        {
            prime=false;
        }
        return prime;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Check Number is Prime or Composite");
        System.out.print("Enter a number which you want to check :");
        int num=sc.nextInt();
        if(isPrime(num))
        {
            System.out.println(num+" is Prime");
        }
        else
        {
            System.out.println(num+" is Composite");
        }
        sc.close();
    }
    
}
