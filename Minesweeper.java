public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        int x = 0;

        boolean[][] mines = new boolean[m + 2][n + 2];
        int[][] neighbors = new int[m + 2][n + 2];

        while (x < k) {
            int rm = (int) (Math.random() * (m));
            int rn = (int) (Math.random() * (n));
            if (!mines[rm + 1][rn + 1]) {
                mines[rm + 1][rn + 1] = true;
                x++;
            }
        }


        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (mines[i][j]) {
                    System.out.print(" * ");
                }
                else {
                    if (mines[i - 1][j]) {
                        neighbors[i][j]++;
                    }
                    if (mines[i + 1][j]) {
                        neighbors[i][j]++;
                    }
                    if (mines[i][j - 1]) {
                        neighbors[i][j]++;
                    }
                    if (mines[i][j + 1]) {
                        neighbors[i][j]++;
                    }
                    if (mines[i - 1][j + 1]) {
                        neighbors[i][j]++;
                    }
                    if (mines[i + 1][j - 1]) {
                        neighbors[i][j]++;
                    }
                    if (mines[i - 1][j - 1]) {
                        neighbors[i][j]++;
                    }
                    if (mines[i + 1][j + 1]) {
                        neighbors[i][j]++;
                    }
                    System.out.print(" " + neighbors[i][j] + " ");
                }
            }
            System.out.println();
        }


    }

}
