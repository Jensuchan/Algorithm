import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] tmp = my_string.split("");
        for(int i=0; i<my_string.length(); i++) {
        	if(Character.isUpperCase(my_string.charAt(i))) {
        		tmp[i] = String.valueOf(Character.toLowerCase(my_string.charAt(i)));
        	}
        }
        Arrays.sort(tmp);
        for(int i=0; i<tmp.length; i++) {
        	answer += tmp[i];
        }
        return answer;
    }
}