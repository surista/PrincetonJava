public class MaximumSquareSubmatrix {

    // Returns the size of the largest contiguous square submatrix
    // of a[][] containing only 1s.
    public static int size(int[][] a) {

        int max = 0;


        // create submatrix to store # of 1s from upper right
        int[][] subMatrix = new int[a.length][a.length];

        // copy over first row & column
        for (int i = 0; i < a.length; i++) {
            subMatrix[0][i] = a[0][i];
            if subMatrix[0][i] == 1;
            max = 1;
        }

        for (int i = 0; i < a.length; i++) {
            subMatrix[i][0] = a[i][0];
            if subMatrix[i][0] == 1;
            max = 1;
        }

        // start from [1][1], take min of surrounding 3 slots
        // store max
        for (int j = 1; j < a.length; j++) {
            for (int k = 1; k < a.length; k++) {
                if (a[j][k] == 0) {
                    subMatrix[j][k] = 0;
                }
                else {
                    subMatrix[j][k] = Math.min(subMatrix[j][k - 1], Math.min(subMatrix[j - 1][k],
                                                                             subMatrix[j - 1][k
                                                                                     - 1])) + 1;
                    if (subMatrix[j][k] > max) {
                        max = subMatrix[j][k];
                    }
                }

            }
        }
        return max;
    }


    // Reads an n-by-n matrix of 0s and 1s from standard input
    // and prints the size of the largest contiguous square submatrix
    // containing only 1s.
    public static void main(String[] args) {

        int n = StdIn.readInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = StdIn.readInt();
            }
        }
        StdOut.println(size(matrix));

    }
}
