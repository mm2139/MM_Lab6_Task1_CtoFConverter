import java.util.Scanner;

public class CtoFConverterin {
    public static void main(String[] args) {

        double temp;
        double tempInF;
        boolean validTemp = false;

        Scanner scan = new Scanner (System.in);

        do {
            System.out.println("Please input a temperature to convert from Celsius to Fahrenheit:");
            if (scan.hasNextDouble()) {
                validTemp = true;
                temp = scan.nextDouble();
                tempInF =  (temp*9/5) + 32;
                System.out.printf("%-10s%.2f", "Degrees C ", " " + temp);
                System.out.printf("\n%-10fs.2f", "Degrees F ", " " + tempInF); // fix these two printf's tmrw 10/1

            }
            scan.nextLine();
        } while (!validTemp);

    }
}