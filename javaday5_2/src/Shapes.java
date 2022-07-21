public class Shapes {
    public Shapes(){

    }
    public void area(int radius,double pi){
        double circleArea = pi * Math.pow((double)radius,2.0);
        System.out.println("The Area of Circle is:"+" "+ circleArea);
    }

    public void area(int length,int breadth){
        int rectangleArea = length*breadth;
        System.out.println("The Area Of the Rectangle is :"+" "+ rectangleArea);
    }

    public void area(int side){
        int squareArea = side ^ 2;
        System.out.println("The Area Of Square is :"+" "+ squareArea);
    }
}
