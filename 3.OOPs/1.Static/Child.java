public class Child {
    public static void main(String[] args) {
        //Use Static Variable and Method of another "Parent Class"
        System.out.println("static variable of Parent class- a:"+Parent.a);
        System.out.println("static variable of Parent class- b:"+Parent.b);
        Parent.add();

    }
}
