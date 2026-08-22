interface Sports
{
    void play();
}

class Person
{
    void eat()
    {
        System.out.println("Person eats");
    }
}

class Student extends Person
{
    void study()
    {
        System.out.println("Student studies");
    }
}

class CollegeStudent extends Student implements Sports
{
    public void play()
    {
        System.out.println("College student plays");
    }
}


public class Hybrid {
    public static void main(String[] args)
    {
        CollegeStudent c = new CollegeStudent();

        c.eat();
        c.study();
        c.play();
    }
}
