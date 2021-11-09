public class ProblemAlgo9 {
    public static boolean isPalindrome(int x) {
        Integer i = Integer.valueOf(x);
        String s = i.toString();
        for (int c = 0; c < s.length() / 2; c++) {
            if (s.charAt(c) != s.charAt(s.length() - c - 1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int c = 123321;
        System.out.println(isPalindrome(c));
    }
}