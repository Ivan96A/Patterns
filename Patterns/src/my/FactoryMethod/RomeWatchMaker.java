package my.FactoryMethod;

/**
 * Created by Iwan on 09.12.2015.
 */
public class RomeWatchMaker implements WatchMaker {
    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}
