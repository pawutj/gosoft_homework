public class ProblemAlgo1 {
    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++)
            for (int j = i + 1; j < nums.length; j++)
                if (nums[i] + nums[j] == target) {
                    int[] c = { i, j };
                    // System.out.println(i);
                    return c;
                }
        int[] c = { 0 };
        return c;
    }

    public static void main(String[] args) {
        int[] c = { 2, 7, 11, 15 };
        int target = 9;
        System.out.println(twoSum(c, target)[0]);
    }
}