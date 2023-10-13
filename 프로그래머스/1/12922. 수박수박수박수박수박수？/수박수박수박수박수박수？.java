class Solution {
    public String solution(int n) {
        String tmp1 = "수";
        String tmp2 = "박";
        String answer = "";
        for(int i=1; i<=n; i++) {
        	if(i%2==1) {
        		answer += tmp1;
        	}else {
        		answer += tmp2;
        	}
        }
        return answer;
    }
}