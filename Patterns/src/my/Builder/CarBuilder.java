package my.Builder;

/**
 * Created by Iwan on 08.12.2015.
 */
abstract class CarBuilder {
    Car car;
    void createCar() {
        car = new Car();
    }

    abstract void buildName();
    abstract void buildModel();
    abstract void buildSpeed();

    Car getCar() {
        return car;
    }
}
