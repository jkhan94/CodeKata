import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers) {
        int[] temp = new int[numbers.length*(numbers.length - 1)/2];
        int idx=0;

        for (int i = 0; i < numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++){
                temp[idx] = numbers[i] + numbers[j];
                idx++;
            }
        }

        int[] answer = Arrays.stream(temp).distinct().toArray();
        Arrays.sort(answer);
        return answer;
    }
    
}

// set은 중복을 허용하지 않으므로 처음부터 set에 넣는 것도 방법.
/*
import java.util.HashSet;
import java.util.Set;
class Solution {
     public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

    */