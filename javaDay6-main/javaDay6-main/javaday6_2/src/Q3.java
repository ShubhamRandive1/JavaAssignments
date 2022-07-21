import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The length of array");
        int len = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr = new int[len];
        for(int i = 0; i < len; i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int j = 0; j<arr.length; j++){
            boolean Prime = true;
            for(int k = 2; k < j; k++){

                if(j%k == 0){
                    Prime = false;
                    break;
                }
            }

            if(Prime){
                System.out.println(j);
            }
        }


    }
}
