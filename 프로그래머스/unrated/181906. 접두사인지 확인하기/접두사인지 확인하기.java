class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String tmp = "";
        for(int i=1; i<=my_string.length(); i++) {
        	tmp = my_string.substring(0, i);
        	if(tmp.equals(is_prefix)) {
        		return 1;
        	}
        }
        return answer;
    }
}