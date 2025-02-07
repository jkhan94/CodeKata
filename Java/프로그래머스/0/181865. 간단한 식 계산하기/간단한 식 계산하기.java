class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] bi = binomial.split(" ");
        int num1 = Integer.parseInt(bi[0]);      
        int num2 = Integer.parseInt(bi[2]);
        String operand = bi[1];            
        
        switch(operand){
                case"+":
                    answer = num1+num2;
                    break;
                case"-":
                    answer = num1-num2;
                    break;
                case"*":
                    answer = num1*num2;
                    break;
        }
        return answer;
    }
}