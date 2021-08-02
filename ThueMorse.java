public class ThueMorse {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int[] thue = new int[n * n];

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                thue[i] = 0;
            }
            // if i is even:
            else if (i % 2 == 0) {
                thue[i] = thue[(i / 2)];
            }
            // if i is odd:
            else {
                thue[i] = (1 - thue[i - 1]);
            }
        }

        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                if (thue[j] == thue[k]) {
                    System.out.print("+  ");
                }
                else {
                    System.out.print("-  ");
                }
            }
            System.out.println();
        }
    }
}
