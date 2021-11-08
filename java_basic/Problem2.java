public class Problem2 {

    public static void multiplyTable(String[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++)
                System.out.printf("%d, ", Integer.parseInt(table[i][j]) * 2);
            System.out.print('\n');
        }
    }

    public static void main(String[] args) {
        String[][] table = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };
        multiplyTable(table);
    }
}
