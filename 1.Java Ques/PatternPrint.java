/*
Draw Pattern
*
**
***
****
*****
******
*******
******
*****
****
***
**
*

*/



public class PatternPrint {
    public static void main(String[] args) 
    {
       for(int i=1;i<=5;i++)  //Loop to how many lines/rows required for 1st half
       {
        for(int j=1;j<=i;j++) //loop to how many times we have to print star in one line/row
        {
            System.out.print("* ");
        }
        System.out.println(); //to add new line
       }
       for(int a=6;a>=1;a--)  //Loop to how many lines/rows required for 2nd half
       {
        for(int b=1;b<=a;b++) //loop to how many times we have to print star in one line/row
        {
            System.out.print("* ");
        }
        System.out.println();  //to add new line
       }
    }
    
}
