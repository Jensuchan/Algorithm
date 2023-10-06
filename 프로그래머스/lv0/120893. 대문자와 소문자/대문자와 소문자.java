class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] tmp = my_string.split("");
        for(int i=0; i<tmp.length; i++) {
        	if(Character.isUpperCase(my_string.charAt(i))){
        		answer += tmp[i].toLowerCase();
        	}else {
        		answer += tmp[i].toUpperCase();
        	}
        }
        return answer;
    }
}