class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        if(q==1) {
        	return code;
        }
        for(int i=0; i<code.length(); i++) {
        	if(i%q == r) {
        		answer += code.substring(i, i+1);
        	}
        }
        return answer;
    }
}