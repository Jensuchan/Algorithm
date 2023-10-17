class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0;
        for(char c : s.toCharArray()) {
        	if(c == '(') {
        		count++;
        	}else {
        		if(count == 0) {
        			return false;
        		}
        		count--;
        	}
        }
        if(count != 0) {
        	return false;
        }
        return answer;
    }
}