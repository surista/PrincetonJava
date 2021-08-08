public class RevesPuzzle {

    private static void reves(int n, String a, String b, String c, String d) {
        if (n == 1) {
            System.out.println("Move disc " + n + " from " + a + " to " + d);
            return;
        }
        int k = (int) Math.round(1.0 + n - Math.sqrt(1.0 + 2 * n));
        reves(k, a, d, c, b);
        hanoi(n, k, a, c, d);
        reves(k, b, a, c, d);
    }

    private static void hanoi(int n, int k, String start, String mid, String end) {
        if (n == k) return;
        hanoi(n - 1, k, start, end, mid);
        System.out.println("Move disc " + n + " from " + start + " to " + end);
        hanoi(n - 1, k, mid, start, end);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        reves(n, "A", "B", "C", "D");
    }
}
