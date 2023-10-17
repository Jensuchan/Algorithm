class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String[] tmp = my_string.split("");
        int a = (int)(Math.ceil((double)(e-s)/2)); //반복할 횟수
        for(int i=0; i<a; i++) {
        	String tmp1 = tmp[s+i];
        	tmp[s+i] = tmp[e-i];
        	tmp[e-i] = tmp1;
        }
        for(String str : tmp) {
        	answer += str;
        }
        return answer;
    }
}