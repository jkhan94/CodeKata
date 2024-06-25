package programmers;

import java.util.Collections;
import java.util.HashMap;

/*
targets가 keymap에 없으면 -1
키맵이 여러 개면 찾는 문자의 인덱스가 최소인 키맵에서 가져와야 함.
그렇다면 키맵별로 문자를 찾고, 문자가 있는 인덱스 위치를 저장.
저장된 인덱스 중 -1 제외, 가장 작은 값을 가진 걸 픽. 인덱스+1 = 키 누르는 횟수.
*/
public class StrangeKeyboard {
    public static void main(String[] args) {
        String[] keymap = {"ABCE"};
        String[] targets = {"ABDE"};

        int[] answer = new int[targets.length];
        int index = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < targets.length; i++) {
            for (int j = 0; j < targets[i].length(); j++) {
                for (int k = 0; k < keymap.length; k++) {
                    index = keymap[k].indexOf(targets[i].charAt(j));
                    if(index != -1){
                        map.put(k, index);
                    }
                }
                if(!map.isEmpty()){
                    Integer minValue = Collections.min(map.values());
                    answer[i] += minValue+1;
                } else {
                    answer[i]=-1;
                    break;
                }
                map.clear();
            }
        }

        for (int i=0; i<answer.length;i++){
            System.out.print(answer[i]+" ");
        }

    }
}
