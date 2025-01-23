/*
자료형	    최대값	                                        최대 자릿수
byte	    127	                                            3
short	    32,767	                                        5
int	        2,147,483,647	                                10
long	    9,223,372,036,854,775,807	                    19
float	    약 ±3.40282347 × 10³⁸ (7자리 정밀도)      	    7
double	    약 ±1.7976931348623157 × 10³⁰⁸ (15자리 정밀도)	15

정수형은 정확한 자릿수 기준
부동소수점(float, double)은 유효숫자(precision) 기준
*/
class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] num = num_str.split("");
        
        for(int i=0; i<num.length; i++){            
            answer += Integer.parseInt(num[i]);
        }
        
        return answer;
    }
}