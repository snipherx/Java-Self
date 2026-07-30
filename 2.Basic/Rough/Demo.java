import java.util.Scanner;
public class Demo 

{
    public static boolean gender(String gdr)
    {
        String male="male";
        boolean ismale;
        if(gdr.equalsIgnoreCase(male))
        {
            ismale=true;
        }
        else
        {
            ismale=false;
        }

        return ismale;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=sc.nextLine();
        System.out.print("Enter your gender: ");
        String gndr=sc.nextLine();
        if(gndr.equalsIgnoreCase("male"))
        {
            boolean ismale=gender(gndr);
            if(ismale==true)
            {
                System.out.println("Welcome Mr."+name);
            }
            else
            {
                System.out.println("Welcome Ms."+name);
            }
        }
        else if(gndr.equalsIgnoreCase("female"))
        {
            boolean ismale=gender(gndr);
            if(ismale==true)
            {
                System.out.println("Welcome Mr."+name);
            }
            else
            {
                System.out.println("Welcome Ms."+name);
            } 
        }
        else
        {
            System.out.println("Error");
        }
        
        
    }
    
}
