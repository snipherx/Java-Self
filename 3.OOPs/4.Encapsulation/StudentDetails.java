public class StudentDetails {
    private String name="Ashutosh Singh";
    private int roll=170103023;
    private String dob="22-02-1998";
    private long sapId=1000009100;
    private void detail()  //private method
    {
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
        System.out.println("DOB: "+dob);
        System.out.println("SapID: "+sapId);
    }
    // StudentDetails(String name,int roll,String dob,int sapId)  //Constructor
    // {
    //     this.name=name;
    //     this.roll=roll;
    //     this.dob=dob;
    //     this.sapId=sapId;
    // }
    // StudentDetails()
    // {
        
    // }
    public String fetch(int pwd)
    {
        if(123==pwd)
        {
            return name;
        }
        else
        {
            return "Wrong Password!!!";
        }
    }
    public static void main(String[] args) {
        StudentDetails s1=new StudentDetails();
        s1.detail();
    }
}
