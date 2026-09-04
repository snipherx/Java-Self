class Doctor
{
    public static void genralCheckup()
    {
        System.out.println("Do General Checkup");
    }
}

class Cardiologist extends Doctor
{
    public static void heart()
    {
        System.out.println("Can do heart Transplant");
    }
}

public class Demo {

    public static void main(String[] args) {
        Cardiologist.genralCheckup();
        Cardiologist.heart();
    }
}