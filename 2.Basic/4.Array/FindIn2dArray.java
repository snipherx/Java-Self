import java.util.Scanner;
public class FindIn2dArray {
    public static boolean isFound(int check,int[][] aray)
    {
        boolean isFound=false;
        for(int row=0;row<aray.length;row++)
        {
            for(int column=0;column<aray[row].length;column++)
            {
                if(check==aray[row][column])
                {
                    isFound=true;
                    break;
                }
            }
        }
        return isFound;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] aray={{1,2,3},{3,2,5}};
        System.out.print("Enter a number to search :");
        int check=sc.nextInt();
        if(isFound(check, aray))
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("Not Found");
        }
        sc.close();

    }
    
}
