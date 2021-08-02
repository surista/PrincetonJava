public class Coupons {
    public static void main(String[] args) {
        int M = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int cards = 0;
        boolean[] found;


        for (int t = 0; t < trials; t++) {
            found = new boolean[M];
            int distinct = 0; // number of distinct cards
            while (distinct < M) {
                int r = (int) (Math.random() * M);
                cards++;
                if (!found[r]) {
                    found[r] = true;
                    distinct++;
                }
            }
        }
        System.out.println(cards / trials);
    }
}
