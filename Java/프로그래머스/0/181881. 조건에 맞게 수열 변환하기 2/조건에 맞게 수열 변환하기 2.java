/*
50이상 짝수 /2
50미만 홀수 *2+1

배열 내에 50초과 홀수, 50이하 짝수만 있으면 중단됨.
*/
import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int[] arr2 = new int[arr.length];
        int x = -1;
        
        while(!Arrays.equals(arr2, arr)){
            arr2 = arr.clone();
            x++;
            
            for(int i=0; i<arr.length; i++){
            if(arr[i]>=50 && arr[i]%2 == 0){ // 50이상 짝수
                    arr[i] /= 2;
                } else if(arr[i]<50 && arr[i]%2 != 0){ // 50미만 홀수
                    arr[i] = arr[i]*2 +1;
                }
            }            
        }            
        
        return x;
    }
}