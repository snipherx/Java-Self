class ParentClass
{
    void greeting()
    {
        System.out.println("Parent Class greeting Method");
    }
}

public class MethodOverriding extends ParentClass {
    @Override
    void greeting()
    {
        System.out.println("Child class greeting"); //Method Overriding
    }
    public static void main(String[] args) {
        MethodOverriding a=new MethodOverriding();
        a.greeting();
    }

}
