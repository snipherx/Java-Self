interface Father
{
    default void work()
    {
        System.out.println("Father works as an Engineer");
    }
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
