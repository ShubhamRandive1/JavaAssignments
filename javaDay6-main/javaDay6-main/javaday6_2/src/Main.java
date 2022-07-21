import java.util.Scanner;

public class Main {


    public static String reverseString(String str){
        char[] ch =str.toCharArray();

        StringBuilder res= new StringBuilder();

        for(int i=ch.length-1;i>=0;i--){
            res.append(ch[i]);
        }
        return res.toString();
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The String You Want To Reverse");

        String s = sc.next();

        System.out.println("You want to Reverse :"+ s);


        System.out.println("Ther Reversed String is :"+" "+reverseString(s));

    }
}