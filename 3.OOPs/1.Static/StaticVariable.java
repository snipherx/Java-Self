public class StaticVariable {
    static int a=22; //Static Variable(Global Variable)
    static float f=2.32f; //Static variable (to compare priority with local variable with same name)
    public static void main(String[] args) {
        System.out.println("Direct Use: "+a);  //Use Directly
        System.out.println("Use with Class Name: "+StaticVariable.a); //With the help of class name
        float f=5.55f; //Local Variable(same name as gloabal variable)
        System.out.println("Local Variable: "+f); //if we call direcly it give priority to local variable
        System.out.println("Global/Static Variable: "+StaticVariable.f);  //Now it use global variable
    }
    
}
