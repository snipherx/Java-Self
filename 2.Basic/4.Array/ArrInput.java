import java.util.Scanner;
public class ArrInput {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[4][3];
        for(int row=0;row<arr.length;row++)
        {
            for(int column=0;column<arr[row].length;column++)
            {
                System.out.print("Enter element of array: ");
                arr[row][column]=sc.nextInt();
            }
        }
        System.out.println("Your Array is:");
        for(int row=0;row<arr.length;row++)
        {
            for(int column=0;column<arr[row].length;column++)
            {
                //System.out.print(arr[row][column]+"  ");
                System.out.printf("%5d", arr[row][column]); 
                /*-->%d — placeholder for an integer.
                  -->5 — minimum field width of 5 characters.
                  Each number gets right-aligned within 5 spaces,
                  so single-digit and multi-digit numbers still 
                  line up in neat columns.*/
            }
            System.out.println();
        }
        sc.close();
    }
    
}
