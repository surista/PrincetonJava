public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int i = 0;
        int j = 0;
        int steps = 0;
        System.out.println("(" + i + ", " + j + ")");
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
            System.out.println("(" + i + ", " + j + ")");
            steps++;
        }
        System.out.println("steps = " + steps);
    }
}
