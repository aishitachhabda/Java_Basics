class Solution {
    // Function to print the value X on the screen N times
    public void printX(int X, int N) {

        // Loop to print the value X, N times
        for (int i = 0; i < N; ++i) {
            // Print the value X
            System.out.print(X);

            /*
             * Print a space between numbers,
             * but not after the last one
             */
            if (i < N - 1) {
                System.out.print(" ");
            }
        }

        // Move to the next line after printing
        System.out.println();
    }
}