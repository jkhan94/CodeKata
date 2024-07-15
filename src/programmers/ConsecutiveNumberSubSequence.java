package programmers;

import java.util.HashSet;
import java.util.Set;

public class ConsecutiveNumberSubSequence {
    public static void main(String[] args) {
        int[] elements = {7, 9, 1, 1, 4};
        Set<Integer> set = new HashSet<>();
        int[] dp = new int[elements.length];

        for (int len = 1; len <= elements.length; len++) {
            for (int i = 0; i < elements.length; i++) {
                dp[i] += elements[(len + i - 1) % elements.length];
                set.add(dp[i]);
            }
        }
    }
}
