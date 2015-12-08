package my.Singleton;

/**
 * Created by Iwan on 08.12.2015.
 */
public class Singleton {
    String name;
    int age;

    private static Singleton instance = new Singleton();

    private Singleton() {
         name = "Iwan";
        age = 19;
    }

    public synchronized static  Singleton getInstance() {
              return instance;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String setName( String name) {
        return this.name = name;
    }

    public int setAge(int age) {
        return this.age = age;
    }


}
