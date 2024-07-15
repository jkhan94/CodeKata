package programmers;

import java.util.Arrays;

public class HIndex {
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        Arrays.sort(citations);

        int max = 0;
        for (int i = citations.length - 1; i > -1; i--) {
            int min = (int) Math.min(citations[i], citations.length - i);
            if (max < min) max = min;
        }

        System.out.println(max);
    }
}
