class Solution {
    public long solution(long n) {
        long answer = 0;     
        String s = Long.toString(n);                 
        int arr[] = new int[s.length()];
        
        for(int i=0; i<s.length(); i++){
            arr[i]=Integer.parseInt(s.substring(i,i+1));   
        }
        for(int j=1; j<arr.length;j++){
            for(int i=1; i<arr.length; i++){
                if(arr[i-1]<arr[i]){
                    int temp = arr[i-1];
                   arr[i-1]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        s="";
        for(int k=0; k<arr.length;k++){
            s+=arr[k];
        }
        
        answer = Long.parseLong(s);        
        return answer;
    }
}

/*
// 1. 정수를 Integer.toString() 메소드 통해 String으로 변환
// 2. chars() 메소드로 char배열로 쪼갬
// 3. 문자 배열을 sorted() 메소드로 오름차순 정렬
// 4. 오름차순인 각 요소 c를 하나씩 맨 앞으로 이동해서 내림차순 정렬. 오름차순된 값 112378을 8부터 왼쪽에 붙여 873211

public class ReverseInt {
    String res = "";

public int reverseInt(int n){
        res = "";
        Integer.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char)c) + res);
        return Integer.parseInt(res);
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        ReverseInt ri = new ReverseInt();
        System.out.println(ri.reverseInt(118372));
    }
}
*/