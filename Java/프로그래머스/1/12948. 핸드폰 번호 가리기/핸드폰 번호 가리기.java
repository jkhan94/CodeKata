/*
StringBuffer 는 동기화를 지원하므로 멀티스레드로 문자열 수정 시 유리.
StringBuilder는 동기화 미지원. 그러나 스트링버퍼보다 빨라서 동작속도 면에서 유리.
서로 호환되므로 스트링버퍼와 스트링빌더의 사용법은 동일.
https://junghn.tistory.com/entry/JAVA-%EB%AC%B8%EC%9E%90%EC%97%B4-%EB%B6%99%EC%9D%B4%EB%8A%94-%EB%B0%A9%EB%B2%95concat-StringBuilder-StringBuffer
*/
class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<phone_number.length()-4;i++){
           sb.append("*");            
        }
        sb.append(phone_number.substring(phone_number.length()-4,phone_number.length()));
        String answer = sb.toString();
        
        return answer;
    }
}

/*
// 앞만 바꿔주면 되니까 캐릭터로 변형해서 분리하고, 필요한 부분만 *로 대체해서 반환해도 됨
char[] ch = phone_number.toCharArray();
for(int i = 0; i < ch.length - 4; i ++){
    ch[i] = '*';
}
return String.valueOf(ch);
*/