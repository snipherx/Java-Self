public class VariableShadowing {
    static String name="Unknown"; //Global Static Variable
    public static void main(String[] args) {
        String name="Ashu";
        System.out.println(name);  //local name shadowing glabal name
        //To use Global name we use classname
        System.out.println(VariableShadowing.name);
    }

}
