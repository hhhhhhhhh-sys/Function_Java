public class bitWiseOperation {

    // Get the i-th bit
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    // Set the i-th bit to 1
    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    // Clear the i-th bit to 0
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static void main(String[] args) {
        int n = 13; // Binary: 1101
        int i = 1;

        // Get i-th bit
        System.out.println("Original number: " + n + " (binary: " + Integer.toBinaryString(n) + ")");
        System.out.println("The " + i + "th bit is: " + getIthBit(n, i));

        // Set i-th bit
        int setResult = setIthBit(n, i);
        System.out.println("After setting " + i + "th bit: " + setResult + " (binary: " + Integer.toBinaryString(setResult) + ")");

        // Clear i-th bit
        int clearResult = clearIthBit(n, i);
        System.out.println("After clearing " + i + "th bit: " + clearResult + " (binary: " + Integer.toBinaryString(clearResult) + ")");
    }
}
