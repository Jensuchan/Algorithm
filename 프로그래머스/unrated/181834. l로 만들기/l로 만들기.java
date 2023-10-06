class Solution {
    public String solution(String myString) {
        String answer = "";
        String[] tmp = myString.split("");
        for(int i=0; i<tmp.length; i++) {
        	if(tmp[i].compareTo("l") <= -1) {
        		tmp[i] = "l";
        	}
        	answer += tmp[i];
        }
        return answer;
    }
}