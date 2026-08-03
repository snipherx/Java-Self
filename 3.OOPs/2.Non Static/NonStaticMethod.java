public class NonStaticMethod {
    int a=22;  //Non-Static variable
    void greet()
    {   //This block is non-static context
        System.out.println("Welcome");
        System.out.println(a); //we can use non-static variable directly inside non-static context

    }
    void localVsGlobal()
    {
        //make a veriable with same data type and name as Global variable
        int a=21; //local variable
        System.out.println("This is local variable of localVsGlobal() method : "+a); //if we call directly it give priority to local

        //If we use the Global veriable we have to make object or use "this" keyword
        System.out.println("This is Global Variable :"+this.a); //"this" keyword conatin address of the current object and it work only in Non-static context
    }
    public static void main(String[] args) {
        //call non-static method for that we make object first
        NonStaticMethod x=new NonStaticMethod();
        x.greet();
        x.localVsGlobal();
    }
    
}
