import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("Enter City Name :");
        String City = c.next();
        c.close();

        switch(City){
            case "Mumbai":
                System.out.println("Financial City");
                break;
            case "Kolkata":
                System.out.println("City Of Joy");
                break;
            case "Delhi":
                System.out.println("Capital Of Country");
                break;
            case "Bangalore":
                System.out.println("Cyber City");
                break;
            default:
                System.out.println("May Be Other Indian City");
        }
    }
}
