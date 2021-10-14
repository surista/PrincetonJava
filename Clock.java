public class Clock {

    private int hr;
    private int min;

    // Creates a clock whose initial time is h hours and m minutes.
    public Clock(int h, int m) {

        if (h < 0 || h > 23 || m < 0 || m > 59) {
            throw new IllegalArgumentException("argument is null");
        }

        hr = h;
        min = m;
    }


    // Creates a clock whose initial time is specified as a string, using the format HH:MM.
    // public Clock(String s) {
    //
    //     if (h < 0 || h > 23 || m < 0 || m > 59) {
    //         throw new IllegalArgumentException("argument is null");
    //     }
    //
    //     return
    // }

    // Returns a string representation of this clock, using the format HH:MM.
    public String toString() {
        return this.hr + ":" + this.min;
    }


    // Is the time on this clock earlier than the time on that one?
    public boolean isEarlierThan(Clock that) {
        Clock a = this;

        if (a.hr < that.hr) return true;
        if ((a.hr == that.hr) && (a.min < that.min)) return true;
        else return false;
    }

    // // Adds 1 minute to the time on this clock.
    // public void tic()
    //
    // Adds Δ minutes to the time on this clock.
    public void toc(int delta) {
        if (delta < 0) {
            throw new IllegalArgumentException("argument is null");
        }
        while (delta > 60) {
            
        }

    }

    // Test client (see below).
    public static void main(String[] args) {
        Clock test = new Clock(23, 59);

        System.out.println(test.toString());
    }
}
