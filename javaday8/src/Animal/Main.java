package Animal;

public class Main {
        public static void main(String[] args) {

            int size = 3;
            int[] Animal = new int[size];

            Cat cat = new Cat();
            Dog dog = new Dog();
            Tiger tiger = new Tiger();

            System.out.println(cat instanceof Animal);//true
            System.out.println(dog instanceof Cat);//false
            System.out.println(tiger instanceof Dog);//true
            System.out.println(cat instanceof Tiger);//false
            System.out.println(cat instanceof Dog);//true


            for(int i=0;i< Animal.length;i++) {
                cat.eat();
                cat.makeNoise();
                cat.walk();
                dog.makeNoise();
                dog.eat();
                dog.walk();
                tiger.makeNoise();
                tiger.eat();
                tiger.walk();
            }

        }

}
