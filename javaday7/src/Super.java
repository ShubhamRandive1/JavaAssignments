import java.util.Scanner;

public class Super {

    String a;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Super ss = new Super();


        System.out.println("Enter the string 1");

        ss.a = sc.next();

        String x = ss.a;

        System.out.println("The String is in super :"+" "+ x);



        System.out.println("Enter New String 2");

        inheritIt kk = new inheritIt();

        ss.a = sc.next();

        String k = ss.a;

        System.out.println("The New String 2 is : "+" "+k);


       kk.getToSuper();





    }

}

class inheritIt extends Super{

    String a;

    void getToSuper(){
        System.out.println(this.a);


        System.out.println(super.a);
    }

}