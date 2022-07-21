import java.util.Scanner;
public class CourseMain {

    public CourseMain(){

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id Details here");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            Course c1 = new Course();
            System.out.println("Enter Name");
            String name = sc.next();
            System.out.println("Enter ID");
            int id = sc.nextInt();
            System.out.println("Enter fees");
            int fee = sc.nextInt();

            c1.setCourseName(name);
            c1.setCourseid(id);
            c1.setCourseFee(fee);

            new Course(id,name,fee);
            System.out.println("Student: "+ i);
            c1.displayCourseDetails();

        }
    }
}
