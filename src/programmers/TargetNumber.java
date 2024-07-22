package programmers;

public class TargetNumber {
    static int answer = 0;

    public static void main(String[] args) {
        int[] numbers = {4, 1, 2, 1};
        int target = 2;
        int[] calc = new int[numbers.length];

        dfs(0, 0, numbers, target);

        System.out.println(answer);
    }

    private static void dfs(int depth, int sum, int[] numbers, int target) {
        if (depth == numbers.length) {
            if (sum == target) {
                answer++;
                return;
            } else {
                return;
            }
        }

        dfs(depth + 1, sum - numbers[depth], numbers, target);
        dfs(depth + 1, sum + numbers[depth], numbers, target);
    }
}
