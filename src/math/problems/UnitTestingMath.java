package math.problems;
import static java.lang.Math.PI;
public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.
        UnitTestingMath unit = new UnitTestingMath();
        double unitPi = Math.PI;
        System.out.println("The value of PI  " + unitPi);
        double unitSin = Math.sin(0.5);
        System.out.println("The Deg of SIN(0.5) = "  + unitSin);
        double unitCos = Math.cos(0.75);
        System.out.println("The Deg of COS(0.75) = " + unitCos);
    }
}
