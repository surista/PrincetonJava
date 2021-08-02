public class Deck {
    public static void main(String[] args) {
        String[] suit = { "h", "s", "c", "d" };
        String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
        String[] deck = new String[52];

        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suit.length; j++) {
                deck[i * 4 + j] = rank[i] + suit[j];
            }
        }

        for (int m = 0; m < 52; m++) {
            int r = m + (int) (Math.random() * (52 - m));
            String t = deck[r];
            deck[r] = deck[m];
            deck[m] = t;
        }
        //
        // for (int d = 0; d < 52; d++) {
        //     System.out.print(deck[d] + " ");
        // }

        for (int k = 0; k < 5; k++) {
            int r = (int) (Math.random() * 52);
            System.out.print(deck[r] + " ");
        }

    }

}
