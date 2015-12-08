package my.Builder;

/**
 * Created by Iwan on 08.12.2015.
 */
public class Renault extends CarBuilder {
    @Override
    void buildName() {
         car.setName("Renault");
    }

    @Override
    void buildSpeed() {
        car.setSpeed(220);
    }

    @Override
    void buildModel() {
        car.setModel("Errt3");
    }
}
