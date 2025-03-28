/*
1. 배열 활용 (18분 소요)
photo를 순회하면서 이름이 저장된 name의 인덱스 찾음.
해당 인덱스의 yearning을 더함.

2. Map 활용
name을 키로, yearning을 값으로 이름-그리움 맵 만듬
photo를 순회하면서 containsKey를 활용해 name을 키 값으로 값을 더함. 키가 없으면 0 더함.
*/
import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<name.length; i++){
            map.put(name[i], yearning[i]);
        }
        
        for(int i=0; i<photo.length; i++){
            for(String peo : photo[i]){
                if(map.containsKey(peo)){
                    answer[i]+=map.get(peo);
                }
            }            
        }
        
        return answer;
    }
}

/*
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for(int i=0; i<photo.length; i++){
            for(int j=0; j<photo[i].length; j++){
                for(int k=0; k<name.length; k++){
                    if(photo[i][j].equals(name[k])){
                        answer[i]+=yearning[k];
                        break;
                    }
                }
            }
        }
        
        return answer;
    }
}
*/