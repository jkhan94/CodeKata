/*
차이를 저장하고 그걸 기준으로 정렬.

Map은 키를 숫자, 값을 차이로 해야 할 텐데 값 기준으로 정렬해야 할 거고.
entrySet 사용해서 value로 정렬하고, value가 같으면 key 기준 정렬...
말만 써도 복잡하다. 탈락.

차라리 버블소트처럼 앞뒤 비교해서 자리를 바꿔주는 건?
*/
import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {       
        int temp = 0;
        Arrays.sort(numlist); // ASC
        
        for(int i=0; i<numlist.length-1; i++){
            for(int j=i+1; j<numlist.length; j++){
                if(Math.abs(numlist[i] -n) > Math.abs(numlist[j] -n)){
                    swap(numlist,i,j);                    
                } else if(Math.abs(numlist[i] -n) == Math.abs(numlist[j] -n)){
                    if(numlist[i] < numlist[j]){ // 앞이 더 작으면
                        swap(numlist,i,j);  
                    }
                }
            }                        
        }
     
        return numlist;
    }
    
    // numlist의 주소를 복사받아 동일한 데이터를 참조
    // numlist[i], numlist[j]를 넘기면 복사값이 사용되어 배열에 영향 없음
    private static void swap(int[] numlist, int i, int j){
        int temp = numlist[i];
        numlist[i] = numlist[j];
        numlist[j]=temp;
    }
}