public class Gene {

    public static boolean isPotentialGene(String dna) {
        boolean atg = dna.startsWith("ATG");
        boolean ends = dna.endsWith("TAG");

        if (dna.length() % 3 != 0) return false;
        if (!dna.startsWith("ATG")) return false;
        if (!dna.endsWith("TAG")) return false;

        return true;
    }

    public static void main(String[] args) {
        String dna = "ATGCATAGCGCATAG";

        System.out.println(isPotentialGene(dna));
    }
}
