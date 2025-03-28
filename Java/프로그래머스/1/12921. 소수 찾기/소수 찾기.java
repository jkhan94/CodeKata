/*
에라토스테네스의 체: n의 제곱근이하만큼 2부터 반복해서 나누어 떨어지지않으면 소수.
=> isPrime 배열의 인덱스는 검사할 숫자이므로 제곱근까지만 처리하면 됨
=> j<=Math.sqrt(i) 보다 j*j<=i가 단순 곱셈이라 더 빠름.

모든 수를 소수로 가정하고, 1은 소수가 아니니까 2~n까지 순회하면서 소수의 배수를 지움.
첫 숫자인 2가 소수이므로 2의 배수 삭제.
3도 소수이므로 3의 배수 삭제.
4 건너뛰고 5로, 6 건너뛰고 7로 이동.
=> 반복문의 시작점이 소수인 2라서 가능한 알고리즘.
*/
class Solution {
    public int solution(int n) {
        int answer =  0;
        boolean[] isPrime = new boolean[n+1];
        
        for(int i=2; i<=n; i++){
            isPrime[i]=true;
        }
                
        for(int i=2; i*i<=n; i++){
            if(isPrime[i]){
                // i*2, i*3, ... 순서대로 지워야하는데 i보다 작은 수의 배수를 지우면서 2*i, 3*i는 지워짐
                // 따라서 i의 배수들 중 처음으로 처리해야 하는 값은 i*i
                for(int j=i*i; j<=n; j+=i){
                    isPrime[j] = false;
                }
            }
        }
        
        for(int i=2; i<=n; i++){
            if(isPrime[i]){
                answer++;
            }
        }
        
        return answer;
    }
}