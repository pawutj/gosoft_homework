
public class Problem5 {

    public static void draw18(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i) - 1; j++)
                System.out.print('-');

            for (int j = 0; j < i + 1; j++)
                System.out.print('*');
            System.out.print('\n');
        }
    }

    public static void draw24(int n) {
        int index = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++)
                System.out.print('-');
            for (int j = 0; j < 2 * i + 1; j++)
                System.out.print('*');
            for (int j = 0; j < n - i - 1; j++)
                System.out.print('-');
            System.out.print('\n');
        }

        for (int i = 0; i < 2 * n - 1; i++)
            System.out.print('*');
        System.out.print('\n');

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < i + 1; j++)
                System.out.print('-');
            for (int j = 2 * n - 1; j > i * 2 + 2; j--)
                System.out.print('*');
            for (int j = 0; j < i + 1; j++)
                System.out.print('-');
            System.out.print('\n');
        }

    }

    public static void draw25(int n) {
        int index = 1;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++)
                System.out.print('-');
            for (int j = 0; j < 2 * i + 1; j++)
                System.out.print(index++);
            for (int j = 0; j < n - i - 1; j++)
                System.out.print('-');
            System.out.print('\n');
        }

        for (int i = 0; i < 2 * n - 1; i++)
            System.out.print(index++);
        System.out.print('\n');

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < i + 1; j++)
                System.out.print('-');
            for (int j = 2 * n - 1; j > i * 2 + 2; j--)
                System.out.print(index++);
            for (int j = 0; j < i + 1; j++)
                System.out.print('-');
            System.out.print('\n');
        }

    }

    public static void main(String[] args) {
        draw25(3);
    }
}
