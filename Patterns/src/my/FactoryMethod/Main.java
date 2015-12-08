package my.FactoryMethod;

/**
 * Created by Iwan on 09.12.2015.
 */
public class Main {
   public static void main(String[] args) {
       WatchMaker maker = new DigitalWatchMaker();
      Watch watch = maker.createWatch();
      watch.showTime();
   }
}
