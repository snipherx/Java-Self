public class NonStaticVariable {
    int x=24;  //non-static variable(Global Variable)
    public static void main(String[] args) {
        //Calling non static variable for that we have to make object first
        NonStaticVariable a=new NonStaticVariable();
        //Here, NonStaticVariable() is a Constructor and we have not creating a Constructor then compiler will automatically make a constructor but it was a  Non-paramaterized Constructor
        System.out.println(a.x);

    }
}
