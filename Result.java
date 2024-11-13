/**
 * The Result class represents the result of finding the maximum subset sum in an array.
 * It contains the starting index, the ending index, and the sum of the maximum subset.
 */
public class Result {
    private byte tStart;
    private byte tEnd;
    private byte tSum;

    /**
     * Constructor to initialize the Result object with the start index, end index, and sum.
     *
     * @param tStart The starting index of the subarray.
     * @param tEnd The ending index of the subarray.
     * @param tSum The sum of the subarray.
     */
    public Result(byte tStart, byte tEnd, byte tSum) {
        this.tStart = tStart;
        this.tEnd = tEnd;
        this.tSum = tSum;
    }

    // Getter methods
    public byte getStart() {
        return tStart;
    }

    public byte getEnd() {
        return tEnd;
    }

    public byte getSum() {
        return tSum;
    }
}
