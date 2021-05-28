package day4;

public class Parking {

    public static double calculateCharges(double numHours) {

        double garageCost = 2;

        if (numHours > 3 && numHours < 24) {
            garageCost = 2.0 + 0.5 * (numHours - 3);
        }

        else if (numHours == 24) {
            garageCost = 40;

        }
        return garageCost;
    }
}