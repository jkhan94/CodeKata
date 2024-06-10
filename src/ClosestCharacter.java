import java.util.HashMap;

public class ClosestCharacter {
    public static void main(String[] args) {
        String s = "banana"; // 012345
        int[] answer = new int[s.length()]; //-1 -1 -1 2 2 2

        /*for (int i = 0; i < s.length(); i++) {
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
        }*/

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            Integer a = map.getOrDefault(ch,i+1);
            answer[i] = i-map.getOrDefault(ch,i+1);
            map.put(ch,i);
        }

        for (int item : answer) {
            System.out.println(item);
        }
    }
}
