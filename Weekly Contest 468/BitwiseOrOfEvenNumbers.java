public class BitwiseOrOfEvenNumbers {

    public static int calculateBitwiseOR(int[] arr) {
        int result = 0; // Initialize the result to 0

        for (int number : arr) {
            // Check if the number is even
            if (number % 2 == 0) {
                // If it's even, perform the bitwise OR operation
                result = result | number; 
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] myArray = {2, 5, 8, 11, 14};
        int bitwiseORResult = calculateBitwiseOR(myArray);
        System.out.println("The bitwise OR of even numbers is: " + bitwiseORResult); // Output: 14
    }
}