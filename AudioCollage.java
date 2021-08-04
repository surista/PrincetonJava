public class AudioCollage {

    // Returns a new array that rescales a[] by a multiplicative factor of alpha.
    public static double[] amplify(double[] a, double alpha) {
        double[] amp_New = new double[a.length];

        for (int i = 0; i < a.length; i++) {
            amp_New[i] = a[i] * alpha;
        }
        return amp_New;
    }


    // Returns a new array that is the reverse of a[].
    public static double[] reverse(double[] a) {
        double[] rev_New = new double[a.length];

        for (int i = 0; i < a.length; i++) {
            rev_New[i] = a[a.length - i - 1];
        }
        return rev_New;
    }


    // Returns a new array that is the concatenation of a[] and b[].
    public static double[] merge(double[] a, double[] b) {
        double[] merge_New = new double[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            merge_New[i] = a[i];
        }
        for (int j = a.length; j < (a.length + b.length); j++) {
            merge_New[j] = b[j - a.length];
        }
        return merge_New;
    }

    // Returns a new array that is the sum of a[] and b[],
    // padding the shorter arrays with trailing 0s if necessary.
    public static double[] mix(double[] a, double[] b) {

        double[] mix_New = new double[Math.max(a.length, b.length)];
        for (int i = 0; i < mix_New.length; i++) {
            if (a.length > i) {
                mix_New[i] += a[i];
            }
            if (b.length > i) {
                mix_New[i] += b[i];
            }
        }
        return mix_New;
    }


    // Returns a new array that changes the speed by the given factor.
    public static double[] changeSpeed(double[] a, double alpha) {

        int n = a.length;

        double[] chgSpeed = new double[(int) (n / alpha)];

        for (int i = 0; i < chgSpeed.length; i++) {
            chgSpeed[i] = a[(int) (i * alpha)];
        }
        return chgSpeed;
    }


    // Creates an audio collage and plays it on standard audio.
    // See below for the requirements.
    public static void main(String[] args) {
        double[] wav1 = StdAudio.read("chimes.wav");
        double[] wav2 = StdAudio.read("piano.wav");
        double[] wav3 = StdAudio.read("cow.wav");
        double[] wav4 = StdAudio.read("harp.wav");
        double[] wav5 = StdAudio.read("singer.wav");

        StdAudio.play(AudioCollage.amplify(wav1, 2));
        StdAudio.play(AudioCollage.mix(wav1, wav2));
        StdAudio.play(AudioCollage.merge(wav2, wav3));
        StdAudio.play(AudioCollage.reverse(wav4));
        StdAudio.play(AudioCollage.changeSpeed(wav5, 1.2));

    }
}
