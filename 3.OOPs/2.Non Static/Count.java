public class Count {
    static int count;
    int times;
    {
        count++;
        times=count;
    }
    void ObjectCount()
    {
        System.out.println("_____Welcome_____");
        System.out.println("Total No of Object: "+times);
    }
    public static void main(String[] args) {
        Count a1=new Count();
        System.out.println("Object= "+a1.times);
        Count a2=new Count();
        System.out.println("Object= "+a2.times);
        Count a3=new Count();
        System.out.println("Object= "+a3.times);
        Count a4=new Count();
        System.out.println("Object= "+a4.times);
        Count a5=new Count();
        System.out.println("Object= "+a5.times);
        a5.ObjectCount();

        
    }
    
}
