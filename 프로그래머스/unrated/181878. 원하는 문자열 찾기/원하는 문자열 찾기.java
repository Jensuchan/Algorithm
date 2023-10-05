class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String tmp1 = myString.toUpperCase();
        String tmp2 = pat.toUpperCase();
        if(tmp1.contains(tmp2)) {
        	return 1;
        }
        return answer;
    }
}