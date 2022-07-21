package StaticNonStatic;

public class StaticNonStatic {
    int a = 10;
    int b = 20;

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int Total = a + b;
        System.out.println("Total Addition for(Public Static Void Method) is "+" "+ Total);

        StaticNonStatic TotalSum = new StaticNonStatic();

        int Summation = TotalSum.a + TotalSum.b;

        System.out.println("Total Addition for (Non Static Method) is"+" "+ Summation);
    }
}
