public class ProblemAlgo38 {

    public static String tran(String s) {
        String temp = "";
        int initInt = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                temp = temp + initInt + s.charAt(i - 1);
                initInt = 1;
            } else
                initInt = initInt + 1;
        }
        temp = temp + initInt + s.charAt(s.length() - 1);
        return temp;
    }

    public static String countAndSay(int n) {
        if (n == 1)
            return "1";
        String initValue = "1";
        for (int i = 1; i < n; i++) {
            initValue = tran(initValue);
        }
        return initValue;

    }

    public static void main(String[] args) {
        // String s = "3322251";
        // System.out.println(tran(s));
        System.out.println(countAndSay(4));
    }
}