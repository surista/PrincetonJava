public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        long steps = 0;
        for (int k = 0; k <= trials; k++) {
            int i = 0;
            int j = 0;
            while (Math.abs(i - 0) + Math.abs(j - 0) < r) {
                double random = Math.random();

                if (random >= 0.75) {
                    i++;
                }
                else if (random >= 0.50) {
                    i--;
                }
                else if (random >= 0.25) {
                    j++;
                }
                else {
                    j--;
                }
                steps++;
            }
        }
        System.out.println("average number of steps = " + (double) steps / trials);
    }
}
