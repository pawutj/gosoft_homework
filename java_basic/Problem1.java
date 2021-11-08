/**
 * Problem1_1
 */

public class Problem1 {

    public static void draw1(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print('*');
        }
    }

    public static void draw2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print('*');
            System.out.print('\n');
        }
    }

    public static void draw3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++)
                System.out.print(j);
            System.out.print('\n');
        }
    }

    public static void draw4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > 0; j--)
                System.out.print(j);
            System.out.print('\n');
        }
    }

    public static void draw5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(i);
            System.out.print('\n');
        }
    }

    public static void draw6(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n; j++)
                System.out.print(i);
            System.out.print('\n');
        }
    }

    public static void draw7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++)
                System.out.print(j + n * (i - 1));
            System.out.print('\n');
        }
    }

    public static void draw8(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++)
                System.out.print(n * n - (j + n * (i - 1)) + 1);
            System.out.print('\n');
        }
    }

    public static void main(String[] args) {
        draw8(4);
    }
}