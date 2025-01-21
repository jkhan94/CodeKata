class Solution {
    public int[] solution(String s) {
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
        return answer;
    }
}
/*
map.getOrDefault(키, 키에 매핑된 값이 없거나 null일 때 반환값)
찾는 key가 존재하면 해당 key에 매핑되어 있는 값을 반환하고, 그렇지 않으면 디폴트 값이 반환

인덱스에 해당하는 캐릭터를 ch에 저장
map에 <알파벳, 인덱스> 형태로 데이터 저장. 알파벳에 해당하는 가장 큰 인덱스를 저장.
키(알파벳)으로 인덱스를 가져오는데, 만약 인덱스가 없다면 i-(i-1) = -1
알파벳이 있는 가장 큰 인덱스를 저장하고 있으므로 j에 해당하는 for문 불필요.
*/
/*
import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            answer[i] = i-map.getOrDefault(ch,i+1);
            map.put(ch,i);
        }

        return answer;
    }
}
*/