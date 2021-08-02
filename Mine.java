public class Mine {

    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        //defining 2-d matrix arr[1-m][1-n];
        char arr[][] = new char[m + 1][n + 1];
        int tmp = k;
        int row_num = (int) ((Math.random() * (m)) + 1);
        int column_num = (int) ((Math.random() * (n)) + 1);
        //generating k mines randomly.
        while (tmp > 0) {
            //keep generating row and column numbers till the time we have
            //a position which does not contain '*'.
            while (arr[row_num][column_num] == '*') {
                //generates random number between [1-m].
                row_num = (int) (Math.random() * (m) + 1);
                //generates random number between [1-n].
                column_num = (int) (Math.random() * (n) + 1);
            }
            //setting generated position as '*'.
            arr[row_num][column_num] = '*';
            tmp--;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (arr[i][j] != '*') {
                    //count the number of neighbours which are '*';
                    int count = 0;
                    if (i - 1 >= 1 && i - 1 <= m && j >= 1 && j <= n && arr[i - 1][j] == '*')
                        count++;
                    if (i - 1 >= 1 && i - 1 <= m && j + 1 >= 1 && j + 1 <= n
                            && arr[i - 1][j + 1] == '*')
                        count++;
                    if (i >= 1 && i <= m && j + 1 >= 1 && j + 1 <= n && arr[i][j + 1] == '*')
                        count++;
                    if (i + 1 >= 1 && i + 1 <= m && j + 1 >= 1 && j + 1 <= n
                            && arr[i + 1][j + 1] == '*')
                        count++;
                    if (i + 1 >= 1 && i + 1 <= m && j >= 1 && j <= n && arr[i + 1][j] == '*')
                        count++;
                    if (i + 1 >= 1 && i + 1 <= m && j - 1 >= 1 && j - 1 <= n
                            && arr[i + 1][j - 1] == '*')
                        count++;
                    if (i >= 1 && i <= m && j - 1 >= 1 && j - 1 <= n && arr[i][j - 1] == '*')
                        count++;
                    if (i - 1 >= 1 && i - 1 <= m && j - 1 >= 1 && j - 1 <= n
                            && arr[i - 1][j - 1] == '*')
                        count++;
                    //converts the number to char value. Ex: 2 is converted to '2';
                    arr[i][j] = (char) (count + 48);
                }
            }
        }

        //printing the resulting 2-d matrix.
        System.out.println("Final result:");
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
