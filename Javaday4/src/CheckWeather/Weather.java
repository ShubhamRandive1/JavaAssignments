package CheckWeather;

public class Weather {
    public static void main(String[] args) {
        boolean isSnowing = false;
        boolean isRaining = true;
        double Temperature = 50.00;

        if(isSnowing == true || isRaining == true || Temperature > 60)
        {
            System.out.println("Lets Stay Home");
        }
        else {
            System.out.println("Lets Go Out !");
        }
    }
}
