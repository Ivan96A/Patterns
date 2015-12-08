package my.FactoryMethod;

import java.util.Date;

/**
 * Created by Iwan on 09.12.2015.
 */
public class DigitalWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println(new Date());
    }
}
