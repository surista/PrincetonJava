public class Escape {
    public static void main(String[] args) {

        int N = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int deadends = 0;

        for (int t = 0; t < trials; t++) {
            boolean[][] current = new boolean[N][N];
            int x = N / 2, y = N / 2;

            while (x > 0 && x < N - 1 && y > 0 && y < N - 1) {
                if (current[x - 1][y] && current[x + 1][y] && current[x][y - 1] && current[x][y
                        + 1]) {
                    deadends++;
                    break;
                }
                current[x][y] = true;
                double r = Math.random();

                if (r >= 0.75) {
                    if (!current[x + 1][y]) x++;
                }

                else if (r >= 0.50) {
                    if (!current[x - 1][y]) x--;
                }

                else if (r >= 0.25) {
                    if (!current[x][y + 1]) y++;
                }

                else {
                    if (!current[x][y - 1]) y--;
                }
            }
        }
        System.out.println(100 * deadends / trials + "% deadends");
    }
}
