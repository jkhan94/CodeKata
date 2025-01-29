/*
mode=0
    !code[i].equals("1") && i%2==0 => ret += code[i]
    code[i].equals("1") => mode=1

mode=1
    !code[i].equals("1") && i%2==1 => ret += code[i]
    code[i].equals("1") => mode=0

문자가 1이면 mode 변경
문자가 1이 아니고 인덱스%2=mode면 문자열 뒤에 붙이기

시작 mode=0
리턴문자가 빈 문자열이면 "EMPTY" 리턴

테스트케이스 추가
"1" "EMPTY"
*/
class Solution {
    public String solution(String code) {
        StringBuffer answer = new StringBuffer();
        String[] codes = code.split("");
        int mode = 0;
        
        for(int i=0; i<codes.length; i++){            
            if(codes[i].equals("1")){
                mode = mode==0? 1 : 0; 
                continue;
            }
            
            if(i%2==mode){
                answer.append(codes[i]);
            }            
        }
        
        return answer.length()==0? "EMPTY" : answer.toString();
    }
}
/*
class Solution {
    public String solution(String code) {
        String answer = "";
        String[] codes = code.split("");
        int mode = 0;
        
        for(int i=0; i<codes.length; i++){
            switch(mode){
                case 0:
                    if(!codes[i].equals("1") && i%2==0){
                        answer += codes[i];
                    } else if(codes[i].equals("1")){
                        mode=1;
                    }
                    break;
                case 1:
                    if(!codes[i].equals("1") && i%2==1){
                        answer += codes[i];
                    } else if(codes[i].equals("1")){
                        mode=0;
                    }
                    break;
            }
        }
        
        if(answer.equals("")){
            answer = "EMPTY";
        }
        
        return answer;
    }
}
*/