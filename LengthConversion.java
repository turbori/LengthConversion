import java.util.Scanner;


/*
Define a method convertToKilometers() that takes two integer parameters as the number of miles and yards. The method returns a double as the length converted to kilometers, given that:

1 yard = 0.0009144 kilometers
1 mile = 1760 yards
Ex: If the input is 2 205, then the output is:

The number of kilometers is 3.406
 */

public class LengthConversion {

    /* Your code goes here */

    public static double convertToKilometers(int numMiles, int numyards){
        double totalYards = (numMiles* 1760) + (numyards);
        double totalKM = totalYards * 0.0009144;
        double totalMilesAndKM = totalKM;

        return totalMilesAndKM;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int miles;
        int yards;

        miles = scan.nextInt();
        yards = scan.nextInt();

        // Print with value rounded to 3 decimal places
        System.out.printf("The number of kilometers is %.3f\n", convertToKilometers(miles, yards));
    }
}