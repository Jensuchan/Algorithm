class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String tmp = "";
        for(int i=0; i<my_string.length(); i++) {
        	tmp = my_string.substring(i, my_string.length());
        	if(tmp.equals(is_suffix)) {
        		return 1;
        	}
        }
        return answer;
    }
}