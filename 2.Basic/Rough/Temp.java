import java.util.Scanner;
//The Fibonacci series is a sequence of numbers where each number is the sum of the two numbers before it.

public class Temp {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number upto which you want to find Fibonacci Series :");
        int n=sc.nextInt();
        int x=0,y=1;
        int fib=0;
        System.out.print("Fibonacci Series upto "+n+"= "+x+","+y+",");
        for(int i=1;i<=n;i++)
        {
            fib=(x+y);
            System.out.print(fib+",");
            x=y;
            y=fib;
        }
        System.out.print(".....");
        sc.close();
    }
    
}
