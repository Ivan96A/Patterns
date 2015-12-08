package my.Strategy;

/**
 * Created by Iwan on 08.12.2015.
 */
public class Main {
        public static void main(String[] args) {
                    Triangle triangle = new Triangle(2.5,3,4);
            System.out.println(triangle.perimeter() + " см." + "\n");

            Square square = new Square(4,5,6,7);
            System.out.println(square.perimeter() + " см.");
        }
}
