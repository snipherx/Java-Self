interface Bird
{
   void fly();
}
interface Fish
{
   void swim();
}
class Parrot implements Bird
{
   @Override
   public void fly()
   {
      System.out.println("Tatori can fly");
   }
}
class Goldenfish implements Fish
{
   @Override
   public void swim()
   {
      System.out.println("Goldi can swim");
   }
}
class Property
{
   static void canFly(Bird b)
   {
      b.fly();
   }
   static void canSwim(Fish f)
   {
      f.swim();
   }
}
public class Demo {

   public static void main(String[] args) {
      Parrot tatori=new Parrot();
      Goldenfish goldi=new Goldenfish();
      Property.canFly(tatori);
      Property.canSwim(goldi);
   }
}
