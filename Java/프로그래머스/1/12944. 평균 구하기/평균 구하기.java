/* 
for(int i=0;i<arr.length;i++)
        answer += arr[i];
return answer/arr.length;
*/
class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        for(int a : arr){
            answer += a;
        }        
        
        return answer/=arr.length;
    }
}