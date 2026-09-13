class Animal
{
    void eat()
    {
        System.out.println("Animal eat food");
    }
}
class Dog extends Animal
{
    void eat()
    {
        System.out.println("Dog eat bone");
    }
    void bark()
    {
        System.out.println("Dog bark");
    }
}
public class Check
{
    public static void main(String[] args)
    {
        Animal a=new Dog(); //Upcasting
        a.eat();
        System.out.print("Animal have intaceof Dog: ");
        System.out.println(a instanceof Dog);
                 //OR
        System.out.println("Animal have instanceof Dog: " + (a instanceof Dog));

        /*
        The most common use of instanceof is before downcasting,
        to make sure the object is of the correct type.
        */
       if(a instanceof Dog)
       {
         Dog d=(Dog)a;
         d.eat();
         d.bark();
       }

       //If i have to use d out of block then we can do like this
       /*
       Dog d = null;
       if (a instanceof Dog) 
       {
        d = (Dog) a;
       }

       if (d != null) {
        d.eat();
        d.bark();
       }
       */
       
    }
}