public class ShannonEntropy {
    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);
        double ent = 0.0; // entropy
        int[] shan = new int[m + 1];
        int count = 0; // number of elements

        while (!StdIn.isEmpty()) {
            int k = StdIn.readInt();
            shan[k]++;
            count++;
        }

        for (int i = 1; i < shan.length; i++) {
            double sum = (double) shan[i] / count;
            double product = 0;
            if (sum != 0) {
                product = sum * ((Math.log(sum) / Math.log(2)));
            }
            ent = ent + product;
        }

        StdOut.printf("%.4f\n", ent * -1);

    }  // end of main method
} // end of class
