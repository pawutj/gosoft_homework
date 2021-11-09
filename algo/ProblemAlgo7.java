public class ProblemAlgo7 {
    public static int reverse(int x) {

        try {
            int rev = Integer.valueOf(x);
            Integer i = Integer.valueOf(Math.abs(x));
            String s = i.toString();
            s = new StringBuffer(s).reverse().toString();
            int result = Integer.parseInt(s);

            return x > 0 ? result : -result;

        } catch (Exception e) {
            return 0;
        }

    }

    public static void main(String[] args) {
    }
}