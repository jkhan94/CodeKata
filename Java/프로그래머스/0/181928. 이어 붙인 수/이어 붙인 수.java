class Solution {
    public int solution(int[] num_list) {
        int even = 0;
        int odd = 0;

        for(int num : num_list) {
            if(num % 2 == 0) {
                even *= 10;
                even += num;
            } else {
                odd *= 10;
                odd += num;
            }
        }

        return even + odd;
    }
}

/*
class Solution {
    public int solution(int[] num_list) {
        StringBuffer odd = new StringBuffer();
        StringBuffer even = new StringBuffer();
        
        for(int num : num_list){
            if(num%2==0){
                even.append(Integer.toString(num));
            } else {
                odd.append(Integer.toString(num));
            }
        }

        return Integer.parseInt(even.toString()) + Integer.parseInt(odd.toString());
    }
}
*/