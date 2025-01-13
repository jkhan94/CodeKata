/*
알파벳 개수가 동일하면 before -> after 변경 가능

1. after에 있는 것이 before에 있으면 replaceFirst 하거나
2. 개수를 각각 센 다음 알파벳 개수별로 비교
    => 2번이 나을 듯
*/
class Solution {
    public int solution(String before, String after) {
        int[] bef = new int[26];
        int[] aft = new int[26];
        
        for(int i=0; i<before.length(); i++){
            bef[before.charAt(i) - 'a']++;
        }
        
        for(int i=0; i<after.length(); i++){
            aft[after.charAt(i) - 'a']++;
        }
               
        for(int i=0; i<aft.length; i++){
            if(aft[i] != bef[i]){
                return 0;
            }
        }
        
        return 1;
    }
}
/*
import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        char[] a = before.toCharArray();
        char[] b = after.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        return new String(a).equals(new String(b)) ? 1 :0;
    }
}
*/