import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to check a number is Even or Odd :");
        int num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println(num+" is Even");
        }
        else
        {
            System.out.println(num+" is Odd");
        }
        System.out.println("Good Bye");
        sc.close();
    }
    
}
