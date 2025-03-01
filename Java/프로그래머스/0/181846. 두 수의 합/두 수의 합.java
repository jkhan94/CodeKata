import java.math.*;
class Solution {
    public String solution(String a, String b) {
        BigInteger bigA = new BigInteger(a);
        BigInteger bibB = new BigInteger(b);   
        
        return (bigA.add(bibB)).toString();         
    }
}