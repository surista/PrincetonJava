public class Huntingtons {

    // // Returns the maximum number of consecutive repeats of CAG in the DNA string.
    public static int maxRepeats(String dna) {
        int count = 1;
        int found = 1;

        // searches for repeated instances of CAG strung together one at a time
        while (found != -1) {
            String repeats = new String(new char[count]).replace("\0", "CAG");
            found = dna.indexOf(repeats, 0);
            count++;
        }

        return count - 2;
    }


    // Returns a copy of s, with all whitespace (spaces, tabs, and newlines) removed.
    public static String removeWhitespace(String s) {
        String sequenceNoSpaces = s
                .replace("\n", "")
                .replace("\r", "")
                .replace("\t", "")
                .replace(" ", "");

        return sequenceNoSpaces;
    }


    // // Returns one of these diagnoses corresponding to the maximum number of repeats:
    // // "not human", "normal", "high risk", or "Huntington's".
    public static String diagnose(int maxRepeats) {
        if (maxRepeats < 10) {
            return "not human";
        }
        else if (maxRepeats < 36) {
            return "normal";
        }
        else if (maxRepeats < 40) {
            return "high risk";
        }
        else if (maxRepeats < 181) {
            return "Huntington's";
        }
        else {
            return "not human";
        }
    }

    // Sample client (see below).

    public static void main(String[] args) {

        String file = args[0];
        In in = new In(file);

        String data = in.readAll();
        String dna = removeWhitespace(data);
        int repeats = maxRepeats(dna);

        StdOut.println("max repeats = " + repeats);
        StdOut.println(diagnose(repeats));


    }
}


