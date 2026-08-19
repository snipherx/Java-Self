//Java does not support multiple inheritance through classes, but it supports it through interfaces.

interface Father  //public interface Father we can also write this
{

    public abstract void property(); //Here public and abstract is optional
    
}
interface Mother
{
    void property();
}

public class Children implements Father,Mother{
    public void property()
    {
        System.out.println("Child's property inherited from Father & Mother both");
    }
    public static void main(String[] args) {
        Children child=new Children();
        child.property();
    }
}
