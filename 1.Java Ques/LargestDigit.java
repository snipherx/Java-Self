//find the largest digit in a number
import java.util.Scanner;
public class LargestDigit {
    public static int lrgDig(int num)
    {
        int lrg=0;
        for(int i=num;i>0;i=i/10)
        {
            if(lrg<(i%10))
            {
                lrg=i%10;
            }
        }
        return lrg;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number to find it's largest digit :");
        int num=sc.nextInt();
        System.out.println(num+" Largest Digit is= "+lrgDig(num));
    }
    
}
