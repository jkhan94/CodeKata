import java.lang.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        String[] a1 = new String[n];
        String[] a2 = new String[n];
        StringBuffer sb = new StringBuffer();
        int len = 0;
        
        for(int i=0; i<n; i++){
            sb.append(Integer.toBinaryString(arr1[i]));
            if(sb.length() < n){
                len = n-sb.length();
                for(int j=0; j<len; j++){
                    sb.insert(0,"0");
                }                
            }
            a1[i] = sb.toString();            
            sb.delete(0,sb.length());
            
            sb.append(Integer.toBinaryString(arr2[i]));
            if(sb.length() < n){
                len = n-sb.length();
                for(int k=0; k<len; k++){                    
                    sb.insert(0,"0");
                }
            }
            a2[i] = sb.toString();            
            sb.delete(0,sb.length());
        }
                
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(a1[i].charAt(j)=='0' && a2[i].charAt(j)=='0'){
                    sb.append(" ");
                } else {
                    sb.append("#");
                }
            }
            answer[i] = sb.toString();
            sb.delete(0, sb.length());
        }
        
        return answer;
    }
}
/*
import java.lang.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        StringBuffer sb = new StringBuffer();
        sb.append("%").append(n).append("s");
        String format = sb.toString();       
                
        for(int i=0; i<n; i++){
            answer[i] = String.format(format,Integer.toBinaryString(arr1[i] | arr2[i]));
            answer[i] = answer[i].replaceAll("1","#");
            answer[i] = answer[i].replaceAll("0"," ");
        }
                        
        return answer;
    }
}
*/