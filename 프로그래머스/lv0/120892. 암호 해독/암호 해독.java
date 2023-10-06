class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] tmp = cipher.split(""); //tmp.length = 24
        //tmp[3] tmp[7] tmp[11] tmp[15] tmp[19] tmp[23]
        for(int i=0; i<tmp.length/code; i++) {
        	answer += tmp[(code*i)+code-1];
        }
        return answer;
    }
}