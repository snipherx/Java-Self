import java.util.Scanner;
public class SimpleIf {
    public static void main(String[] args) {
        //Check a number is even or not??
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to check Wheather it is even or not: ");
        int num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("Number is Even");
        }
        System.out.println("The End");
        sc.close();
    }
    
}
