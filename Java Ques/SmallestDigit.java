//find smallest digit in a number
import java.util.Scanner;
public class SmallestDigit {
    public static int smallDigit(int num)
    {
        int smallDigit=num%10;
        for(int i=num;i>0;i=i/10)
        {
            if(smallDigit>(i%10))
            {
                smallDigit=i%10;
            }
        }
        return smallDigit;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to find smallest digit :");
        int num=sc.nextInt();
        System.out.println(num+" Smallest digit is= "+smallDigit(num));
        sc.close();
    }
}
