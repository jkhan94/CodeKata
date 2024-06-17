/*
3개를 더해서 소수인지 확인.
0123: 012 013 023 123
01234: 012 013 014 023 024 123 124 234

2~주어진 수의 제곱근까지 확인하면 약수가 있는지 확인 가능.
1*10 2*5 5*2 10*1
sqrt(10) = 3.16xx
*/
public class PrimeNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 7, 6, 4}; // 01234: 014 034 124 234

        int answer = 0;
        int sum=0;
        boolean isPrime=true;

        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length;j++){
                for(int k=j+1; k<nums.length; k++){
                    sum = nums[i]+nums[j]+nums[k];
                    for(int l=2;l<=Math.sqrt(sum);l++){
                        isPrime = true;
                        if (sum % l == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if(isPrime){
                        answer++;
                    }
                }
            }
        }

        System.out.println(answer);

    }
}
