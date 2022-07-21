import java.util.Scanner;

public class Q4 {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String");

        String s = sc.next();

        System.out.println("Enter position at which you want to check char");

        int i = sc.nextInt();

        System.out.println("THe String "+" "+ s + " "+ "char at index is: "+" "+ s.charAt(i));

        sc.close();






    }
}
