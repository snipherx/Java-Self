public class NonStaticVariable {
    int x=24;  //non-static variable(Global Variable)
    public static void main(String[] args) {
        //Calling non static variable for that we have to make object first
        NonStaticVariable a=new NonStaticVariable();
        System.out.println(a.x);

    }
}
