package my.Strategy;

/**
 * Created by Iwan on 08.12.2015.
 */
public class Triangle extends Abstract {
    double sideOne;
    double sideTwo;
    double sideThree;

      public Triangle(double sideOne,  double sideTwo, double sideThree) {
            this.sideOne = sideOne;
          this.sideTwo = sideTwo;
          this.sideThree = sideThree;
      }

    @Override
    public double perimeter() {
        return sideOne + sideTwo + sideThree;
    }
}
