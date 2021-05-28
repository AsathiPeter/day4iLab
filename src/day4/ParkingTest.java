package day4;

import java.util.Scanner;

import static day4.Parking.calculateCharges;

public class ParkingTest {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of cars parked yesterday: ");
        final int numberOfCars = sc.nextInt();

        double hoursParked=0;
        double currentCost=0;
        double totalCost=0;

        for(int count = 1; count<=numberOfCars; count++)
        {
            System.out.println("Enter hours parked for car");
            hoursParked = sc.nextDouble();
            currentCost = calculateCharges(hoursParked); //most recent customer
            totalCost+=currentCost; //Running total
        }

        System.out.printf("Most recent customer paid:$%.2f " , currentCost);
        System.out.printf("Running total of receipts:$%.2f " , totalCost);

    }
}
