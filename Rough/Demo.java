interface Tree
{
    void seed();
}
class Mango implements Tree
{
    public void seed()
    {
        System.out.println("Mango have seed");
    }
}
class Banana implements Tree
{
    public void seed()
    {
        System.out.println("Banana donot have seed");
    }
}

/**
 * Demo
 */
public class Demo {

    public static void main(String[] args) {
        Tree t1=new Mango();
        Tree t2=new Banana();
        t1.seed();
        t2.seed();
    }
}