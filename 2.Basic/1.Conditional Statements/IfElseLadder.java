import java.util.Scanner;
public class IfElseLadder {

    //Whenever we have more than 2 option and we need to execute any one of it then we use it
    //WAJP to check the given character is alphabet or digit or special character.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a single character :");
        char a=sc.next().charAt(0);
        if((a>='a'&&a<='z')||(a>='A'&&a<='Z'))
        {
            System.out.println(a+" is Alphabet");
        }
        else if(a>='0'&&a<='9')
        {
            System.out.println(a+" is Number");
        }
        else
        {
            System.out.println(a+" is Special Character");
        }
        sc.close();
    }

    
}
