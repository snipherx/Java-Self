import java.util.Scanner;
public class FindInArray {
     public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
       int[] aray={11,22,33,44,55,66,77,88,99};
       System.out.print("Enter a number to check in array :");
       int check=sc.nextInt();
       boolean found=false;
       for(int index=0;index<aray.length;index++)
       {
        if(aray[index]==check)
        {
            found=true;
            break;
        }
       }
       if (found==true) {
            System.out.println(check+": your number found in array");
        }
        else
        {
            System.out.println("Not found try another number!!!");
        }
        sc.close();
    }
    
}
