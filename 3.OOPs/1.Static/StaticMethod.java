public class StaticMethod {
    public static void task()  //Static Method
    {
        System.out.println(".........Welcome..........");
    }
    public static void main(String[] args) {
        //call Method Directly
        task();
        //Call by class Name
        StaticMethod.task();
    }
    
}
