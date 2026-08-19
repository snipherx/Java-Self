public class ChildClass extends ParentClass {
    ChildClass()
    {
        super();
        System.out.println("Child Default Constructor");
    }
    ChildClass(int x)
    {
        super(x);
        System.out.println("Child Parameterized Constructor: " + x);
    }
    public static void main(String[] args) {
        ChildClass c1=new ChildClass();
        ChildClass c2=new ChildClass(10);
    }
}
