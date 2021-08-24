import java.util.Arrays;

public class Ramanujan {

    // Is n a Ramanujan number?
    public static boolean isRamanujan(long n) {

        long[] x = digitsArray(n);
        long[] y = digitsArray(x[1]);

        long sumOfOriginalDigits = x[1];

        System.out.println("Length X: " + x[0] + " Length Y: " + y[0]);
        System.out.println("Sum X: " + x[1] + " Sum Y: " + y[1]);
        System.out.println("Array X: " + Arrays.toString(x));
        System.out.println("Array Y: " + Arrays.toString(y));


        String str = Arrays.toString(y);
        String clean = str.replaceAll(", ", "").replaceAll("\\[", "").replaceAll("\\]", "");

        System.out.println("str: " + str);
        System.out.println("clean: " + clean);
        System.out.println("clean length: " + clean.length());
        String reverseDigits = "";


        for (int i = 2; i < clean.length(); i++) {
            reverseDigits = reverseDigits + clean.charAt(i);
        }

        long l = Long.parseLong(reverseDigits);

        if ((sumOfOriginalDigits * l) == n) return true;
        else return false;

    }


    // helper function; gets array of digits from sol[2]
    // stores length of array in sol[0] and sum of digits in sol[1]
    public static long[] digitsArray(long d) {
        int length = (int) Math.floor(Math.log10(d) + 1);
        long[] sol = new long[length + 2];
        sol[0] = (long) length;
        long sum = 0;


        for (int i = 2; i < length + 2; i++) {
            sol[i] = (int) (d % 10);
            sum = sum + sol[i];
            d = d - sol[i];
            d = d / 10;
        }
        sol[1] = sum;
        return sol;

    }


    // Takes a long integer command-line arguments n and prints true if
    // n is a Ramanujan number, and false otherwise.
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);

        System.out.println(isRamanujan(n));
    }
}
