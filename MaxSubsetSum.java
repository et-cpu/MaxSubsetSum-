import java.util.Scanner;

/**
 * The MaxSubsetSum class provides the main method for finding the maximum subset sum.
 * It prompts the user for input, processes the data, and displays the result.
 */
public class MaxSubsetSum {

    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner tScanner = new Scanner(System.in);

        // Prompt for array size
        System.out.print("Enter the size of the array: ");
        byte tSize = tScanner.nextByte();

        // Declare the array
        byte[] tArray = new byte[tSize];

        // Prompt for array elements
        System.out.print("Enter the elements of the array: ");
        for (byte tIndex = 0; tIndex < tSize; tIndex++) {
            tArray[tIndex] = tScanner.nextByte();
        }

        // Find the maximum subset sum using the findMaxSubsetSum method
        Result tResult = findMaxSubsetSum(tArray);

        // Display the results
        System.out.println("Maximum Subset Sum: " + tResult.getSum());
        System.out.print("Subarray: [");
        for (byte tIndex = tResult.getStart(); tIndex <= tResult.getEnd(); tIndex++) {
            System.out.print(tArray[tIndex]);
            if (tIndex < tResult.getEnd()) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("Indices: Start = " + tResult.getStart() + ", End = " + tResult.getEnd());
    }

    /**
     * This method finds the maximum subset sum in the given array and returns a Result object with
     * the sum and the starting and ending indices of the subarray.
     *
     * @param tArray The array of integers.
     * @return A Result object containing the maximum subset sum and the indices.
     */
    public static Result findMaxSubsetSum(byte[] tArray) {
        byte tMaxSum = tArray[0];
        byte tCurrentSum = tArray[0];
        byte tStart = 0;
        byte tEnd = 0;
        byte tTempStart = 0;

        // Loop through the array to find the maximum subset sum
        for (byte tIndex = 1; tIndex < tArray.length; tIndex++) {
            if (tCurrentSum < 0) {
                tCurrentSum = tArray[tIndex];
                tTempStart = tIndex;
            } else {
                tCurrentSum += tArray[tIndex];
            }

            // Update the max sum and indices if we find a new maximum
            if (tCurrentSum > tMaxSum) {
                tMaxSum = tCurrentSum;
                tStart = tTempStart;
                tEnd = tIndex;
            }
        }

        return new Result(tStart, tEnd, tMaxSum);
    }
}
