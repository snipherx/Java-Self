class Parent
{
    private String pwd="BPL@123"; //private it can access through get()
    public String get()
    {
        return pwd;
    }
    public static void main(String[] args) {
        Parent a1=new Parent();
        System.out.println(a1.pwd); //we cannot access it directly in another class
    }
}