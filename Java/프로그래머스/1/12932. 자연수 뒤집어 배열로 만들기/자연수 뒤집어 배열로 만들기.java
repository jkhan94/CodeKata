/* 123 = 12 + 3
12 = 1 + 2
1

 return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
 이런 것도 된다는데 좋은 건지는 모르겠다.
*/
class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        int count=0;
        if(n==0){
            answer = new int[] {0};
        } else {
            for(long i=n; i>=0; i--){
                if(i%10 >= 0){
                    count++;
                    i/=10;
                }
            }
            answer = new int[count];
            for(int i=0; i<count; i++){
                answer[i]=(int)(n%10);
                n/=10;
            }                
        }                
        return answer;
    }
}