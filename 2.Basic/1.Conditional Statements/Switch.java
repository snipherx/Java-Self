import java.util.Scanner;

public class Switch {
    //To Check which day it is according to 1 to 7
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number between 1 to 7 to find which day it was :");
        int day=sc.nextInt();
        switch (day) {
                case 1: //here 1 is the value we get from day(input by user)
                    System.out.println("It is Monday");
                    break;
                case 2:
                    System.out.println("It is Tuesday");
                    break;
                case 3:
                    System.out.println("It is wednesday");
                    break;
                case 4:
                    System.out.println("It is Thrusday");
                    break;
                case 5:
                    System.out.println("It is Friday");
                    break;
                case 6:
                    System.out.println("It is Saturday");
                    break;
                case 7:
                    System.out.println("It is Sunday");
                    break;
                default:
                    System.out.println("Please Enter a valid Number!!!");
                    break;
            }
            sc.close();
    }
    
}
