public class ClosestCharacter {
    public static void main(String[] args) {
        String s = "banana"; // 012345
        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    answer[i] = i - j;
                    break;
                }
            }
        }

        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == 0) {
                answer[i] = -1;
            }
        }

        for (int item : answer) {
            System.out.println(item);
        }
    }
}
