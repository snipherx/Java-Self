import java.util.Scanner;

public class Finally {
    static void dash()
{
    System.out.println("----------------------------------------------------");
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter a array of length 5: ");
       int[] a=new int[5];
       for(int i=0;i<a.length;i++)
       {
        a[i]=sc.nextInt();
       }
       System.out.print("Enter a index number to get a element: ");
       int ind=sc.nextInt();
       try{
        System.out.println("Element at index no. "+ind+" is= "+a[ind]);
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
        dash();
        System.out.println(e.getMessage()); //give a small msg about Exception occured
        System.out.println("!!! Index No. must be in range of 0-4 !!!");
        dash();
        System.out.println("Exception Details:- ");
        e.printStackTrace(); //give complete info about the Exception
        dash();


       }
       finally
       {
        System.out.println("Exception handled Successfully");
       }
       System.out.print("Your array: ");
       System.out.print("{ ");
       for(int i=0;i<a.length;i++)
       {
        System.out.print(a[i]+" ");
       }
       System.out.print(" }");
       System.out.println();
       dash();
       sc.close();

    }

}
