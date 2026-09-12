public class HashCode {
    String name;
    int age;

    HashCode(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    @Override 
    public int hashCode()
    {
        return name.hashCode()+Integer.hashCode(age);
    }
    public static void main(String[] args) {
        HashCode h1=new HashCode("Ashu", 27);
        HashCode h2=new HashCode("Ashu", 27);
        /*
        A hash code is an integer value generated for an object.
        */
        System.out.println(h1.name.hashCode()); 
        System.out.println(h2.name.hashCode()); 
        /*
        -hash codes are the same because you are calling hashCode() on the name String,
         not on the HashCode objects.
        -Both are the same String value, and Java's String.hashCode() is based on the
         characters/content of the String.
        */
       
         //Now if we compare HashCode of both object then it was different
         System.out.println("HashCode of h1: "+h1.hashCode());
         System.out.println("HashCode of h2: "+h2.hashCode());

         //But our object have same value and to get hashcode same we have to override hashCode
        
    }
        

}
