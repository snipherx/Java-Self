//WAJP to reverse a number.
import java.util.Scanner;
public class ReverseNum {
    public static int revNum(int num)
    {
        int revNum=0;
        for(int i=num;i>0;i=i/10)
        {
            revNum=revNum*10+(i%10);
        }
        return revNum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number :");
        int num=sc.nextInt();
        System.out.println(num+" reverse is ="+revNum(num));
        sc.close();
    }
    
}
