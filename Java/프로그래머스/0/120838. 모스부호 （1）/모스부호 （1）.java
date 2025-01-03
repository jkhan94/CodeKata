// 해시맵 사용
import java.util.*;
class Solution{
    Map<String, String> morseMap = new HashMap<>(){
            { // 익명클래스 초기화
                put(".-","a");
                put("-...","b");
                put("-.-.","c");
                put("-..","d");
                put(".","e");
                put("..-.","f");
                put("--.","g");
                put("....","h");
                put("..","i");
                put(".---","j");
                put("-.-","k");
                put(".-..","l");
                put("--","m");
                put("-.","n");
                put("---","o");
                put(".--.","p");
                put("--.-","q");
                put(".-.","r");
                put("...","s");
                put("-","t");
                put("..-","u");
                put("...-","v");
                put(".--","w");
                put("-..-","x");
                put("-.--","y");
                put("--..","z");
            }
        };
    
    public String solution(String letter) {
        String answer = "";
        String[] splited = letter.split(" ");
        
        for(String s : splited){
           answer += morseMap.get(s);
        }
        
        return answer;
    }
}
/*
// 배열 사용
class Solution {
    private String[] morse = { 
        ".-","-...","-.-.","-..",".", "..-.",
        "--.", "....", "..",".---","-.-",".-..",
        "--","-.","---",".--.","--.-",".-.",
        "...","-","..-","...-",".--","-..-",
        "-.--","--.."
    };
    
    public String solution(String letter) {
        String answer = "";
        String[] splited = letter.split(" ");
        
        for(String s : splited){
            for(int i=0; i<morse.length; i++){
                if(s.equals(morse[i])){
                    answer += (char)(i+'a');
                    break;
                }
            }            
        }
        
        return answer;
    }
}
*/