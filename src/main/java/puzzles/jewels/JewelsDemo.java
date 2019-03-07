package puzzles.jewels;

import org.junit.Assert;

import java.util.stream.Stream;

public class JewelsDemo {

    public static void main(String[] args) {
        Solution solution = new Solution();

        String j = "aA";
        String s = "aAAbbbb";
        Assert.assertEquals(3, solution.numJewelsInStones(j, s));
    }


}


class Solution {
    public int numJewelsInStones(String j, String s) {
        if (j == null || s == null)
            return 0;

        return (int) Stream.of(s.split("")).filter(x -> j.indexOf(x) > -1).count();
    }
}