import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        String binary = decimalToBinary(decimal);

        System.out.println("Binary representation: " + binary);

        sc.close();
    }

    // Function to convert decimal to binary
    private static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        String binary = "";

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = remainder + binary; // prepend the remainder to the result
            System.out.println("binary="+binary);
            decimal /= 2;
        }

        return binary;
    }
}
