class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] tmp = my_string.split("");
        for(int i=0; i<my_string.length(); i++) {
        	if(tmp[i].equals("a")||tmp[i].equals("e")||tmp[i].equals("i")||
        			tmp[i].equals("o")||tmp[i].equals("u")) {
        		continue;
        	}
        	answer += tmp[i];
        }
        return answer;
    }
}