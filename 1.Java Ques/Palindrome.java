import java.util.Scanner;
//WAJP to  check whether a number is a Palindrome
//A number is a palindrome if it reads the same forwards and backwards (e.g., 121, 1331)

public class Palindrome {

    public static boolean isPalindrome(int num)
    {
        boolean isPalindrome=false;
        int rev=0;
        for(int i=num;i>0;i=i/10)
        {
            rev=rev*10+(i%10);
        }
        if(num==rev)
        {
            isPalindrome=true;
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Palindrome Checker");
        System.out.print("Enter a number to check :");
        int num=sc.nextInt();
        if(isPalindrome(num))
        {
            System.out.println(num+" is Palindrome");
        }
        else
        {
            System.out.println(num+" is not Palindrome");
        }
        sc.close();
    }
    
}
