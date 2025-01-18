/*
자름 (i,j)
sort
indexOf(k)
*/
/*
import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index=0;

        // commands[i][0] ~ commands[i][1] 중 commands[i][2] 번째
        for (int i = 0; i < commands.length; i++) {
            int[] temp = new int[commands[i][1]-commands[i][0]+1];
            for (int j = commands[i][0]; j <= commands[i][1]; j++) {
                temp[index]=array[j-1];
                index++;
            }

            Arrays.sort(temp);

            answer[i]=temp[commands[i][2]-1];
            index=0;
        }
        return answer;
    }
}
*/
/*
Arrays.copyOf(원본 배열, 복사할 길이)
Arrays.copyOfRang(복사할 원본 배열, 복사를 시작할 인덱스, 복사를 끝낼 인덱스)
복사를 시작할 인덱스 ~ 복사를 끝낼 인덱스-1 까지 복사한다.
출처: https://romcanrom.tistory.com/48
*/
import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];

        }
        
        return answer;    
    }

}