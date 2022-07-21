import java.sql.SQLOutput;
import java.util.Scanner;

public class Member  {

    String name;
    int age;
    String phone;
    String address;
    double salary;


    void printSalary(){
        System.out.println("The salary of : " + name +" "+ salary);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Member m = new Member();

        System.out.println("Enter name");

        m.name = sc.next();

        System.out.println("Enter age");

        m.age = sc.nextInt();

        System.out.println("Enter phone");

        m.phone = sc.next();

        System.out.println("Enter address");

        m.address = sc.next();

        System.out.println("Enter salary");

        m.salary = sc.nextDouble();

        Employee ee = new Employee();

        System.out.println("Enter Designation of employee");

        ee.designation = sc.next();

        System.out.println("Enter Department of Employee");

        ee.Department = sc.next();

        Manager mm = new Manager();

        System.out.println("Enter manager designation");

        mm.designation = sc.next();

        System.out.println("Enter manager department");

        mm.Department = sc.next();


        System.out.println("In A Organisation"+" "+ee.name+" works and has specialized in "+ee.designation +" in "+ee.Department);
        System.out.println("BIO:-");
        System.out.println(ee.name);
        System.out.println(ee.age);
        System.out.println(ee.phone);
        System.out.println(ee.address);
        System.out.println("In A New Organisation"+" "+mm.name+" works and has specialized in "+mm.designation+" in "+mm.Department);
        System.out.println("BIO:-");
        System.out.println(mm.name);
        System.out.println(mm.age);
        System.out.println(mm.phone);
        System.out.println(mm.address);





    }
}

class Employee extends Member{

    String designation;
    String Department;


}
class Manager extends Member{

    String designation;
    String Department;

}