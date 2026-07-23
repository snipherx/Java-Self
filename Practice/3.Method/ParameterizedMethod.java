import java.util.Scanner;
public class ParameterizedMethod {
    public static int fact(int num) //Actual Argument
    {
        int fact=1;
        if(num==0)
        {
            fact=1;
        }
        else
        {
            for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to find it's Factorial :");
        int num=sc.nextInt();
        System.out.println("Factorial of "+num+"!= "+fact(num)); //Formal Argument
        sc.close();
    }
    
}
