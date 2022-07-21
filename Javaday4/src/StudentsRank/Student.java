package StudentsRank;

public class Student {
    int roll;
    String name;
    int marks;

    void displayStudentDetails() {
        System.out.println("Roll Number :"+" "+ roll);
        System.out.println("Name :"+" "+ name);
        System.out.println("Marks :"+" "+ marks);
    }

    public static void main(String[] args) {
        Student S1 = new Student();
        Student S2 = new Student();

        S1.roll = 17;
        S1.marks = 65;
        S1.name = "Shubham";
        S1.displayStudentDetails();
        System.out.println("-------------------");
        S2.marks = 75;
        S2.roll = 18;
        S2.name = "Friend";
        S2.displayStudentDetails();


        //Now Garbage Collector

        S1 = null;
        S2 = null;


    }
}
