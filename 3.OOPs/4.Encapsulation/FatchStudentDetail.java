import java.util.Scanner;
public class FatchStudentDetail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StudentDetails s=new StudentDetails();
        System.out.print("Enter password to fetch details: ");
        int pwd=sc.nextInt();
        System.out.println(s.fetch(pwd));
        sc.close();
    }
    
}
