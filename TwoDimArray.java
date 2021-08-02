public class TwoDimArray {
    public static void main(String[] args) {
        int[][] a = {
                { 1, 3, 5 },
                { 2, 0, 7 },
                { 4, 1, 3 },
                };

        int[][] b = {
                { 2, 4, 0 },
                { 1, 4, 3 },
                { 7, 0, 5 },
                };

        int[][] c = new int[3][3];
        int[][] d = new int[3][3];

        // matrix addition
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        // matrix multiplication

        for (int m = 0; m < 3; m++) {
            for (int n = 0; n < 3; n++) {
                for (int k = 0; k < 3; k++)
                    d[m][n] += a[m][k] * b[k][n];
            }
        }

        System.out.println(c[1][1]);
        System.out.println(d[0][0]);
    }
}
