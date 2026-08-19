public class ParentClass {
    ParentClass()
    {
        System.out.println("Parent Default Constructor");
    }
    ParentClass(int x)
    {
        System.out.println("Parent Parameterized Constructor: "+x);
    }
    public static void main(String[] args) {
        ParentClass pc=new ParentClass();
        ParentClass pc1=new ParentClass(11);
    }
}
