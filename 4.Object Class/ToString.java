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
        sc.close();
    }

}
