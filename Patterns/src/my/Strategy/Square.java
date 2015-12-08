package my.Strategy;

/**
 * Created by Iwan on 08.12.2015.
 */
public class Square extends Abstract{
    double sideOne;
    double sideTwo;
    double sideThree;
    double sideFour;

    public Square(double sideOne,  double sideTwo, double sideThree, double sideFour) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
        this.sideFour = sideFour;
    }

    @Override
    public double perimeter() {
        return sideOne + sideTwo + sideThree + sideFour;
    }
}
