import java.util.Objects;
import java.util.Scanner;

public class Course {

    int courseid;
    String courseName;
    int courseFee;


    public Course(){

    }
    public static void authenticate(String userName, String password){
        if(Objects.equals(userName, "Admin") && Objects.equals(password, "1234")){
            Scanner sc = new Scanner(System.in);
            Course c1 = new Course();

            System.out.println("Enter Your Course Name");
            c1.courseName = sc.next();

            System.out.println("Enter Your Course id");
            c1.courseid = sc.nextInt();

            System.out.println("Enter Course fees");
            c1.courseFee = sc.nextInt();

            c1.displayCourseDetails();
        }
        else{
            System.out.println("Invalid Username or password");
        }
    }

    public void displayCourseDetails(){
        System.out.println("The Course Id is : "+" "+this.courseid);
        System.out.println("The Course Name is : "+" "+this.courseName);
        System.out.println("The Course fees is : "+" "+this.courseFee);
    }

    public static void main(String[] args) {
        authenticate("Admin","1234");
    }
}
