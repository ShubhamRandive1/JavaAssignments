package Bird;

public class Main {

    public static void main(String[] args) {
        Bird b1 = new Parrot();

        b1.fly();

        ((Parrot) b1).sing();//cast b1 to parrot and reference the sing method


    }
}
