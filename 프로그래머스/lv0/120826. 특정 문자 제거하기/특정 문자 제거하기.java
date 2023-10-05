class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        String[] tmp = my_string.split("");
        for(int i=0; i<my_string.length(); i++) {
        	if(tmp[i].equals(letter)){
        		continue;
        	}
        	answer += tmp[i];
        }
        return answer;
    }
}