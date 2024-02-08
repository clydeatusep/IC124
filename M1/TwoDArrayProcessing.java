public class TwoDArrayProcessing {
    public static void main(String[] args) {
        // Example two-dimensional array
        int[][] twoDArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Calculate the sum of all elements
        int sum = 0;
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                sum += twoDArray[i][j];
            }
        }
        System.out.println("Sum of all elements: " + sum);

        // Find the maximum element
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                if (twoDArray[i][j] > max) {
                    max = twoDArray[i][j];
                }
            }
        }
        System.out.println("Maximum element: " + max);

        // Calculate the average value
        double average = (double) sum / (twoDArray.length*twoDArray[0].length);
        System.out.println("Average value: " + average);
    }
}

/** Output
Sum of all elements: 45
Maximum element: 9
Average value: 5.0
 */