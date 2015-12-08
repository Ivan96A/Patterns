package my.Singleton;

/**
 * Created by Iwan on 08.12.2015.
 */
public class Main {

    public static void main(String[] args) {

        Singleton mySinglenon = Singleton.getInstance();

        System.out.println("Name --- " + mySinglenon.getName() + "\n"
                + "Age  --- " + mySinglenon.getAge());


        mySinglenon.setName("Kolya");
        mySinglenon.setAge(20);

            System.out.println("\n" + "Name --- " + mySinglenon.getName() + "\n"
                    + "Age  --- " + mySinglenon.getAge());


    }
}
