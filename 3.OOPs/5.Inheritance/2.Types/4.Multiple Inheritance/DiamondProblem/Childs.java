interface Father
{
    default void work()
    {
        System.out.println("Father works as an Engineer");
    }

    /*
    In Java, default methods can create the Diamond Problem because they contain an implementation.
    We override the default method in the child class to remove the ambiguity.
    Abstract methods do not create this problem because they have no implementation.
    */

}

interface Mother
{
    default void work()
    {
        System.out.println("Mother works as a Teacher");
    }
}

public class Childs implements Father, Mother
{
    public void work()
    {
        Father.super.work();
        Mother.super.work();

        System.out.println("Child works as a Developer");
    }
    public static void main(String[] args) {
        Childs c=new Childs();
        c.work();
    }
}
