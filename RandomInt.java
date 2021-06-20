public class RandomInt {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double r = Math.random();
        int t = (int) (N * r);
        System.out.println(r);
        System.out.println(t);

    }
}
