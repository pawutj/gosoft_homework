public class Problem4 {

    public static void keyboard() {
        int row = 5;
        int col = 5;
        int pivot = 1;
        int iter = 1;
        for (int i = 0; i < row * col && pivot <= row; i++) {
            if (pivot > 1)
                System.out.printf("%d x %d = %d ", pivot, iter, pivot * iter);
            iter = iter + 1;
            if (i % row == 0) {
                pivot = pivot + 1;
                iter = 1;
                System.out.print('\n');
            }
        }

    }

    public static void main(String[] args) {
        keyboard();
    }
}
