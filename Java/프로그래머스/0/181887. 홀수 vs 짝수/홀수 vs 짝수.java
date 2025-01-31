/*
가장 첫 번째 원소를 1번 원소 = 홀짝 반대
그런데 홀수합과 짝수합을 비교하므로 큰 의미는 없어보임.
*/
class Solution {
    public int solution(int[] num_list) {
        int odd = 0;
        int even = 0;
        
        for(int i=0; i<num_list.length; i++){
            if(i%2==0){
                odd+=num_list[i];
            } else{
                even+=num_list[i];
            }
        }
        
        return odd>even? odd : even;
    }
}