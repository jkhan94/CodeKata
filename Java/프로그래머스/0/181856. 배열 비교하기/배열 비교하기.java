class Solution {
    public int solution(int[] arr1, int[] arr2) {
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
                return 0;
            } else {
                return Math.max(sum1, sum2) == sum1? 1 : -1;
            }
        } else {
            return Math.max(arr1Len, arr2Len) == arr1Len? 1 : -1;
        }

    }
}