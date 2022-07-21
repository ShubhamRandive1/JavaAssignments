import java.util.Scanner;

public class ShapeMain {



    public ShapeMain(){

    }



    public static void main(String[] args) {

       // Shapes ss = new Shapes();
        Shapes scc = new Shapes();
        Scanner sc = new Scanner(System.in);


       // Circle scc = new Circle();
        System.out.println("Enter For Circle");
        System.out.println("Enter Radius");
        int radius = sc.nextInt();
       // System.out.println("-----------");

       // Square sqq = new Square();
        System.out.println("Enter For Square");
        System.out.println("Enter Side Length");
        int sd = sc.nextInt();
       // System.out.println("------------");

        //Rectangle srr = new Rectangle();
        System.out.println("Enter For Rectangle");
        System.out.println("Enter Length");
        int length = sc.nextInt();
        System.out.println("Enter Breadth");
        int breadth = sc.nextInt();

       // scc.Circle(radius,3.14);

       // sqq.Square(sd);

       // srr.Rectangle(length,breadth);

        scc.area(radius,3.14);

        scc.area(sd);

        scc.area(length,breadth);




    }
}
