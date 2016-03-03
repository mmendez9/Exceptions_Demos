package p2;

/*
 * Created by mmendez9 on 3/1/2016.
 */
public class Main2 {
    public static void main(String[] args) {
            Balloon b1 = buildBalloon(-10, "yellow");

            Balloon b2 = buildBalloon(10, "red");

            Balloon b3 = buildBalloon(-8, "white");

            Balloon b4 = buildBalloon(8, "yellow");
    }

    static Balloon buildBalloon(double arg1, String arg2){
        try {
            Balloon b = new Balloon(arg1, arg2);
            System.out.println(b);
            return b;
        }catch (InvalidDiameterException e) {
            System.out.println(e.getMessage());
        }finally {
            // This will be done whether or not an exception occurred
            System.out.println("Number the balloons = " + Balloon.getNumberOfBalloons());
        }
        return null;
    }
}

class Balloon {
    private double diameter;
    private String color;
    private static int numberOfBalloons = 0;

    public Balloon(double arg1, String arg2) throws InvalidDiameterException {
        if (arg1 > 0)
            diameter = arg1;
        else throw new InvalidDiameterException(arg1);

        color = arg2;
        numberOfBalloons++;
    }

    public static int getNumberOfBalloons() {
        return numberOfBalloons;
    }

    @Override
    public String toString() {
        return "Balloon{" +
                "diameter = " + diameter +
                ", color = '" + color + '\'' +
                '}';
    }
}

// Define a custom exception
class InvalidDiameterException extends Exception {
    // Construct an exception
    public InvalidDiameterException(double e) {
        super("Invalid Diameter " + e);
    }
}