public class HashCodeExperiment {
    String firstName;
    String lastName;
    @Override 
    public int hashCode()
    {
        return firstName.hashCode()+lastName.hashCode();
    }
    HashCodeExperiment(String firstName, String lastName)
    {
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public static void main(String[] args) {
        HashCodeExperiment d1=new HashCodeExperiment("Ashutosh", "Singh");
        HashCodeExperiment d2=new HashCodeExperiment("Ashutosh", "Singh");
        System.out.println("HashCode of d1: "+d1.hashCode());
        System.out.println("HashCode of d2: "+d2.hashCode());
    }
}