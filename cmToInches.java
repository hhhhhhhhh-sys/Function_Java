import java.util.Scanner;

class LengthConverter {
    private double cm; // Stores the input value in cm

    // Constructor to initialize cm
    public LengthConverter(double cm) {
        this.cm = cm;
    }

    // Method to convert cm to feet and inches
    public void convertAndDisplay() {
        final double CM_PER_INCH = 2.54; // Conversion factor
        final int INCHES_PER_FOOT = 12; 

        double totalInches = cm / CM_PER_INCH; // Convert cm to inches
        int feet = (int) (totalInches / INCHES_PER_FOOT); // Extract feet
        double inches = totalInches % INCHES_PER_FOOT; // Extract remaining inches

        // Display the result
        System.out.printf("%.1f centimetres is %d feet %.1f inches.%n", cm, feet, inches);
    }
}

public class CmToFeetInchesConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input
        System.out.print("Enter length in centimetres: ");
        double cmInput = scanner.nextDouble();

        // Create an object of LengthConverter and perform conversion
        LengthConverter converter = new LengthConverter(cmInput);
        converter.convertAndDisplay();

        scanner.close();
    }
}
