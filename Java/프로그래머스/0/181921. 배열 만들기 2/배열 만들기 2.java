/*
0 또는 5로 구성 = 0과 5로 구성되지 않음
*/
/*
import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();
        String temp = "";
        
        for(int i=l; i<=r; i++){
            temp = Integer.toString(i);
            
            if(temp.matches("^[05]+$")){
                answer.add(Integer.parseInt(temp));
            }
        }
        
        if(answer.isEmpty()){
            answer.add(-1);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
*/

import java.util.ArrayList;
class Solution {
    public int[] solution(int l, int r) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < 64; i++) {
            // 0과 5로만 이루어진 숫자를 생성하는 규칙: 이진수의 1을 5로 치환
            // 이진수 문자열 101을 10진법으로 해석하면 101이 그대로 넘어옴.
            // 여기에 5를 곱하면 1만 5로 치환해서 0,5로 구성된 숫자가 나옴.
            int num = Integer.parseInt(Integer.toBinaryString(i))*5;

            if (l <= num && num <= r){
                list.add(num);
            }
        }

        return list.isEmpty()? new int[] { -1 } : list.stream().mapToInt(i -> i).toArray();
    }
}