package my.Builder;

/**
 * Created by Iwan on 09.12.2015.
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new Ford());
        Car car = director.BuildCar();
   System.out.println("Name - " + car.name + " Model - " + car.model + " Speed - " + car.speed);
    }
}
