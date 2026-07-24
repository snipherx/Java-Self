 //Q-WAJP to find the sum of digits of a number.
import java.util.Scanner;
public class DigitSum {
    public static int numDigitSum(int num)
    {
        int sum=0;
        for(int i=num;i>0;i=i/10) //i=i/10 remove last digit of Number
        {
            sum=sum+(i%10); //give last digit of Number
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number :");
        int num=sc.nextInt();
        System.out.println("Sum of digits ="+numDigitSum(num));
        sc.close();
    }
}
