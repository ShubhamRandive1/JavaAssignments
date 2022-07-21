import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Whys is String immutable?");
        System.out.println("Enter s as information is stored in s String");
        String s=("Java Application contains sensitive information like network connection, database connection URL's, passwords,username, etc since these information stored in strings if due to some issue it changes then it will be disastrous");
        sc.next();
        System.out.println(s);
        System.out.println("--------------------------");


        System.out.println("Difference between String and String Builder?");
        System.out.println("Enter d as information is stored in String d");
        String d = ("A String is mutable as it means it cannot be modified however using StringBuilder method we can actually modify the given string but as it is immutable and is not Thread-safe there are multiple threads operating on string so it is fast but where as it can cause issue while multiple thread perform same task");
        sc.next(d);
        System.out.println(d);
        System.out.println("-----------------------------");

        System.out.println("Methods Of String");
        System.out.println("Enter g for String literal");
        String g = "String Literal = String <string name> = welcome";
        sc.next(g);
        System.out.println(g);
        System.out.println("--------------------------------");


        System.out.println("By new Keyword");
        System.out.println("Enter k for string method by new keyword");
        String k = ("String <String name> = new String(welcome)");
        sc.next(k);
        System.out.println(k);
        System.out.println("----------------------------------");


        System.out.println("charAt()");
        System.out.println("Enter c for charAt()");
        String c = ("char charAt( int index), This returns value for particular index");
        sc.next(c);
        System.out.println(c);
        System.out.println("-------------------------------------");


        System.out.println("int length()");
        System.out.println("Enter l for length()");
        String l = ("int length(here length is shown), it returns string length");
        sc.next(l);
        System.out.println(l);
        System.out.println("-------------------------------------------");


        System.out.println("boolean isEmpty");
        System.out.println("Enter b for isEmpty");
        String b = ("boolean isEmpty() check if the string is empty ");
        sc.next(b);
        System.out.println(b);
        System.out.println("----------------------------------------------");








    }
}
