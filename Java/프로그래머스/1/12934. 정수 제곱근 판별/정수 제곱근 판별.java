/*
class Solution {
  public long solution(long n) {
      if (Math.pow((int)Math.sqrt(n), 2) == n) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }
        return -1;
  }
}
*/
/*
Math.sqrt()
제곱근 리턴하는 메소드.
double형을 반환하므로 제곱해서 n인지 비교하기 전에 캐스팅해야 한다.
*/
class Solution {
    public long solution(long n) {
        long answer = 0;
        double sqrt = Math.sqrt(n);
        if(Math.pow((long)sqrt,2) == n){
            answer = (long)Math.pow(sqrt+1,2);
        } else{
            answer = -1;
        }
        return answer;
    }
}