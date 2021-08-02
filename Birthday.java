public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        double fraction = 0.0;
        int sum = 0;

        int[] entered = new int[n + 2];

        for (int t = 0; t < trials; t++) {
            boolean[] ppl = new boolean[n];
            for (int i = 0; i < n; i++) {
                int r = (int) (Math.random() * n - 1);
                if (ppl[r]) {
                    entered[i]++;
                    break;
                }
                else {
                    ppl[r] = true;
                }
            }
        }
        for (int j = 0; j < n + 1; j++) {
            sum += entered[j];
            fraction = (double) sum / trials;
            System.out.println(j + 1 + "\t" + entered[j] + "\t" + fraction);
            if (fraction >= 0.50) {
                break;
            }
        }
    }
}
