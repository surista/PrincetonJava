public class Inversions {

    // Return the number of inversions in the permutation a[].
    public static long count(int[] a) {
        long cnt = 0;
        for (int i = 0; i < a.length; i++) {
            for (int k = i + 1; k < a.length; k++) {
                if (a[i] > a[k]) cnt++;
            }
        }
        return cnt;
    }

    // Return a permutation of length n with exactly k inversions.
    public static int[] generate(int n, long k) {

        // create sorted array of length n
        int[] sol = new int[n];

        if (n == 0 && k == 0) return sol;

        for (int i = 0; i < n; i++) {
            sol[i] = i;
        }

        // for k > n cases
        int greedy = 1;
        int temp;
        while (k > n - greedy) {
            temp = sol[n - 1];
            for (int from = n; from > greedy; from--) {
                sol[from - 1] = sol[from - 2];
            }
            sol[greedy - 1] = temp;
            k = k - (n - greedy);
            greedy++;
        }

        // for k < n-1 cases
        for (int j = n - 1; j > (n - 1 - k); j--) {
            temp = sol[j];
            sol[j] = sol[j - 1];
            sol[j - 1] = temp;
        }
        return sol;
    }

    // Takes an integer n and a long k as command-line arguments,
    // and prints a permutation of length n with exactly k inversions.
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        long k = Long.parseLong(args[1]);

        int[] sol = generate(n, k);

        for (int i = 0; i < sol.length; i++) {
            System.out.print(sol[i] + " ");
        }
    }
}
