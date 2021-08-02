public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);

        // use args.length to determine number of command-line arguments
        int n = args.length;
        int cumsum = 0;

        int[] a = new int[n];
        int[] sums = new int[n];

        for (int i = 0; i < n - 1; i++) {
            a[i] = Integer.parseInt(args[i + 1]);
        }

        for (int j = 0; j < n; j++) {
            cumsum += a[j];
            sums[j] = cumsum;
        }

        for (int k = 0; k < m; k++) {
            int r = (int) (Math.random() * sums[n - 1]);
            for (int p = 0; p <= n; p++) {
                if (r < sums[p]) {
                    System.out.print(p + 1 + " ");
                    break;
                }
            }
        }
    }
}


