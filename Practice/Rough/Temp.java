import java.util.Scanner;
public class Temp {
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
                System.out.print(arr[row][column]+"  ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
