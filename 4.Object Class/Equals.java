public class Equals {
    String name;
    int age;
    Equals(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    @Override 
    public boolean equals(Object obj)
    {
        Equals e=(Equals) obj; //downcasting from Object to Equals
        return this.name==e.name && this.age==e.age;
    }
    public static void main(String[] args) {
       Equals a1=new Equals("Ashu", 27);
       Equals a2=new Equals("Ashu", 27);
       System.out.println("Check object a1 is equal to a2:");
       System.out.println(a1.equals(a2)); 
    }

}
