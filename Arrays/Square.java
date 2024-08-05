public class Square{
    public static void main(String[] args) {
        // Step 1: Create an array to hold the square numbers
        int[] squareNumbers = new int[10];

        // Step 2: Go through each of the array indexes, from 0 to 9
        for (int i = 0; i < 10; i++) {
            // Calculate the square of (i + 1) and store it in the array
            int square = (i + 1) * (i + 1);
            squareNumbers[i] =square ;
        }

        // Step 3: Print the contents of the array to verify the results
        System.out.println("Square numbers:");
        for (int i = 0; i < squareNumbers.length; i++) {
            System.out.println("Index " + i + ": " + squareNumbers[i]);
        }
        for (int square : squareNumbers) {
            // Print the current value of square.
            System.out.println(square);
        }
    }
}
