/**
 * Demo
 */
public class Demo {
    String firstName;
    String lastName;
    @Override 
    public int hashCode()
    {
        return firstName.hashCode()+lastName.hashCode();
    }
    Demo(String firstName, String lastName)
    {
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public static void main(String[] args) {
        Demo d1=new Demo("Ashutosh", "Singh");
        Demo d2=new Demo("Ashutosh", "Singh");
        System.out.println("HashCode of d1: "+d1.hashCode());
        System.out.println("HashCode of d2: "+d2.hashCode());
    }
}