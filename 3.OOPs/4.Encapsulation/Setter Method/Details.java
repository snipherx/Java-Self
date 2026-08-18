public class Details {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Ashutosh");  // setting value via setter
        s1.setAge(25);

        System.out.println(s1.getName()); // Ashutosh
        System.out.println(s1.getAge());  // 25

        s1.setAge(-5); // triggers validation message
    }
}