class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int min, max;
        if(a>=b){
            max=a;
            min=b;
        } else{
            max=b;
            min=a;
        }
        for(int i=min; i<=max; i++){
            answer += i;
        }
        return answer;
    }
}

/*
// 여기서 등차수열의 합을 다시 보네. Sn = n(a+l)/2
class Solution {
    public long solution(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    private long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }
}
*/