package puzzles.binary.subarrays.with.sum;

import org.junit.Assert;

public class Demo {
    /**
     * In an array A of 0s and 1s, how many non-empty subarrays have sum S?
     * <p>
     * Example 1:
     * <p>
     * Input: A = [1,0,1,0,1], S = 2
     * Output: 4
     * Explanation:
     * The 4 subarrays are bolded below:
     * [1,0,1,0,1]
     * [1,0,1,0,1]
     * [1,0,1,0,1]
     * [1,0,1,0,1]
     * <p>
     * <p>
     * Note:
     * <p>
     * A.length <= 30000
     * 0 <= S <= A.length
     * A[i] is either 0 or 1.
     */

    public static void main(String[] args) {
        Assert.assertEquals(4, new Solution().numSubarraysWithSum(new int[]{1, 0, 1, 0, 1}, 2));
        System.out.println();
        Assert.assertEquals(4, new Solution().numSubarraysWithSum2(new int[]{1, 0, 1, 0, 1}, 2));
    }

}


class Solution {

    public int numSubarraysWithSum(int[] A, int S) {

        int count = 0;

        for (int i = 0; i < A.length; i++) {
            int subCount = 0;
            for (int j = i; subCount <= S && j < A.length; j++) {
                subCount += A[j];
                if (subCount == S) {
                    count++;
                }
            }
        }

        return count;
    }

    public int numSubarraysWithSum2(int[] A, int S) {

        int count = 0;

        for (int i = 0; i < A.length; i++) {

            int subCount = 0;

            int j = i;
            do {
                subCount += A[j++];
                if (subCount == S) {
                    count++;
                }
            } while ((A.length - j >= S - subCount) && j < A.length);
        }

        return count;
    }
}
