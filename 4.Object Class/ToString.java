import java.util.Scanner;
public class ToString {
    String name;
    int age;
    ToString(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    @Override 
    public String toString()
    {
        return "Name: "+name+", Age: "+age;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=sc.nextLine();
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        ToString detail=new ToString(name,age);
        System.out.println(detail.toString()); 
        //or we can also write like this
        System.out.println(detail); //it give detail object address due to toString() of object class
         //to print state of object we can override this toString() method of Object class
        sc.close();
    }

}
