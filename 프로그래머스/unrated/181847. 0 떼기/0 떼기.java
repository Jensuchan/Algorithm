class Solution {
    public String solution(String n_str) {
        String answer = "";
        String[] tmp = n_str.split("");
        int index = 0;
        for(int i=0; i<tmp.length; i++) {
        	if(!tmp[i].equals("0")) {
        		index = i;
        		break;
        	}
        }
        for(int i=index; i<tmp.length; i++) {
        	answer += tmp[i];
        }
        return answer;
    }
}