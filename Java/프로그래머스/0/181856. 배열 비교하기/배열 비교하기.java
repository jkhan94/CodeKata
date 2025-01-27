class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int arr1Len = arr1.length;
        int arr2Len = arr2.length;
        int sum1 = 0;
        int sum2 = 0;
        
        if(arr1Len == arr2Len){
            for(int a:arr1){
                sum1+=a;
            }
            for(int b:arr2){
                sum2+=b;
            }
            if(sum1==sum2){
                answer = 0;
            } else {
                if(Math.max(sum1, sum2) == sum1){
                    answer = 1;
                } else {
                    answer = -1;
                }
            }
        } else {
            if(Math.max(arr1Len, arr2Len) == arr1Len){
                answer = 1;
            } else {
                answer = -1;
            }
        }
        
        return answer;
    }
}