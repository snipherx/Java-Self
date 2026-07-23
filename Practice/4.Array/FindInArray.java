import java.util.Scanner;
public class FindInArray {
    public static boolean isFound(int check, int[] arrayNo)
    {
        boolean a=false;
        for(int index=0;index<arrayNo.length;index++)
        {
            if(check==arrayNo[index])
            {
                a=true;
                break;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arrayNo={11,22,33,44,55,66,77,88,99};
        System.out.print("Enter the number you want to search in array: ");
        int check=sc.nextInt();
        boolean isFound=isFound(check, arrayNo);
        if(isFound)
        {
            System.out.println(check+": Your number found in array");
        }
        else
        {
            System.out.println("Not found!! Please try another number");
        }
        sc.close();
    }  
}
