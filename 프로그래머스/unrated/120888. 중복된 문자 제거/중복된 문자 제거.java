import java.util.ArrayList;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] tmp = my_string.split("");
        ArrayList<String> list = new ArrayList<String>();
        for(String a : tmp) {
        	if(!list.contains(a)){
        		list.add(a);
        	}
        }
        String[] tmp1 = new String[list.size()];
        for(int i=0; i<list.size(); i++) {
        	answer += list.get(i);
        }
        return answer;
    }
}