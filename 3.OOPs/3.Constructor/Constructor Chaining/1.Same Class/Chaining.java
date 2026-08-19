//Constructor chaining in Java is the process of calling one constructor from another constructor within the same class or from a parent class.
//Types of Constructor Chaining

// Constructor chaining can be achieved in two ways:

//     Within the same class: Using the this() keyword.

//     From a base/parent class: Using the super() keyword.

//This is same class chaning

public class Chaining {
    String msg="Welcome";
    Chaining()
    {
        System.out.println("3");
    }
    Chaining(int i)
    {
        this();
        System.out.println("2");

    }
    Chaining(double d)
    {
        this(1);
        System.out.println("1");
    }
    public static void main(String[] args) {
        Chaining c=new Chaining(2.00);
        System.out.println(c.msg);
    }

    
}
