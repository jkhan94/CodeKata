/*
분모를 GCD로 나눠서 소인수분해. 소인수가 2,5만 있다면 1 / 다른 숫자 있으면 2 리턴

소인수 : 주어진 자연수를 나누어 떨어뜨리는 약수 중에서 소수(1, 자기자신)인 약수

테스트케이스 추가
1 8 1
1 5 1
1 10 1
1 40 1
16 24 2
1 13 2
6 9 2

1 1000 1
1 100 1
1 10 1

*/
import java.util.*;
class Solution {
    public int solution(int a, int b) {
        int num = b/getGcd(Math.max(a,b), Math.min(a,b));
        HashSet<Integer> set = new HashSet<>(); // 약수 저장
        
        // 소인수 분해
        while(num%2 == 0){ // 짝수 처리
            set.add(2);
            num/=2;
        }
        
        for(int i=3; i<=Math.sqrt(num); i+=2){ // 홀수 처리
            while(num%i == 0){
                set.add(i);
                num/=i;
            }
        }
        
        // 소수가 아니라면 제곱근 이하에서 나누어졌을 것.
        // 나누어떨어질 수였으면 연산 후 num=1.
        // 짝수 처리는 위에서 했으므로 num=2일 수는 없음.
        // 따라서 num>=3이면 남은 숫자는 소수
        // 다 나눴는데 num!=1이면 num은 소수 
        if(num>2){
            set.add(num);
        }
 
        if(set.stream().anyMatch(n -> n != 2 && n != 5)){
            // 2도 아니고, 5도 아니라면 2
            return 2;
        } else {
            return 1;
        }
    }
    
    private int getGcd(int a, int b){
        int temp = 0;
        
        while(a%b > 0){
            temp = b;
            b = a%b;
            a = temp;     
        }
        
        return b;
    }
}