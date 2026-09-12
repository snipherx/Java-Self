//Constructor overloading in Java is a technique that allows a class to have more than one constructor, provided that each constructor has a different list of parameters.

public class ConOverLoading {
    int a;
    double d;
    ConOverLoading()
    {
        System.out.println("Non-Paramaterize Constructor");
    }  
    ConOverLoading(int i)
    {   this.a=i;
        System.out.println("Int only");
    } 
    ConOverLoading(double d)
    {
        this.d=d;
        System.out.println("Double Only");
    }
    public static void main(String[] args) {
        ConOverLoading o1=new ConOverLoading();
        ConOverLoading o2=new ConOverLoading(22);
        ConOverLoading o3=new ConOverLoading(22.22);

    }
}
