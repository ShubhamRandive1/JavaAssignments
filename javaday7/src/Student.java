import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.Stack;

public class Student {

    int roll;
    String name;
    String address;
    int marks;
    int averageMarks;


}

class Demo{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Students");
        int s;
        s = sc.nextInt();

        System.out.println("The Number of student are:"+" "+s);

        Stack<String> ss = new Stack<>();
        Stack<Integer> sk = new Stack<>();

        int[] roll = new int[s];
        String[] name = new String[s];
        String[] address = new String[s];
        int[] marks = new int[s];

        for(int i = 0;i < s ; i++)
        {
            System.out.println("Enter Name");
            name[i] = sc.next();
            System.out.println("Enter roll number");
            roll[i] = sc.nextInt();
            System.out.println("Enter address");
            address[i] = sc.next();
            System.out.println("Enter marks");
            marks[i] = sc.nextInt();

        }

        for(int i = 0; i < s ; i++)
        {
            ss.push("Name:"+" "+name[i]);
            sk.push(roll[i]);
            ss.push("Address"+" "+address[i]);
            sk.push(marks[i]);
        }

        System.out.println(ss);
        System.out.println(sk);



    }

}