package my.Builder;

/**
 * Created by Iwan on 08.12.2015.
 */
public class Ford extends CarBuilder {
    @Override
    void buildModel() {
        car.setModel("S2");
    }

    @Override
    void buildName() {
        car.setName("Ford");
    }

    @Override
    void buildSpeed() {
        car.setSpeed(450);
    }
}
