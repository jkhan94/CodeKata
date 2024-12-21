class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int numx=x;
        int num = 0;
        while(numx>0){
            num = num+numx%10;
            numx/=10;
        }
        if(x%num!=0){
            answer=false;
        }
        return answer;
    }
}

/*
문자 0-9는 아스키코드 값으로 48-57.
// 숫자를 String으로 변환해서
// 문자열을 구성한 문자들의 아스키코드 값을 스트림으로 뽑아서
// 문자에서 문자0(아스키값 48)을 빼서 숫자로 변환. [49, 56] 인데 -48(문자 0의 아스키값)을 하면 [1. 8]    
// 더한다

class Solution {
    public boolean solution(int x) {
        int sum = String.valueOf(x).chars().map(ch -> ch - '0').sum();
        return x % sum == 0;
    }
}
--------------------------------------------------------
public boolean solution(int x) {
    String s = x + "";
    int total = 0;
    for (int i = 0; i < s.length(); i++) {
        total += Integer.parseInt(s.charAt(i)+"");
    }
    return x % total == 0;
}

---------------------------
// 자릿수를 split으로 잘라서 문자열 배열에 저장한다.
public class HarshadNumber{
    public boolean isHarshad(int num){
        String [] tmp = String.valueOf(num).split("");
        int sum=0;
        for(String s:tmp) {
            sum+=Integer.parseInt(s);
        }
        if(num%sum==0) {
            return true;
        } else {
            return false;
        }
    }


    // 아래는 테스트로 출력해 보기 위한 코드
    public static void  main(String[] args){
        HarshadNumber sn = new HarshadNumber();
        System.out.println(sn.isHarshad(18));
    }
}

*/