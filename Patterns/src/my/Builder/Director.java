package my.Builder;

/**
 * Created by Iwan on 09.12.2015.
 */
public class Director {
     CarBuilder builder;
    void setBuilder(CarBuilder b) {
        builder = b;
    }

    Car BuildCar() {
        builder.createCar();
        builder.buildName();
        builder.buildModel();
        builder.buildSpeed();

        Car car = builder.getCar();
        return car;
    }
}
