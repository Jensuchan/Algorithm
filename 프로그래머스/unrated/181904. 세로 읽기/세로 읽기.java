class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        if(m==1) {
        	return my_string;
        }
        //1 5 9 13 17
        //int m = 4 // first+4k
        //c+4x0 / c+4x1 / c+4x2 / c+4x3/ c+4x4
        int start = c-1;
        int cnt = (my_string.length())/m; //5
        for(int i=0; i<cnt; i++) {
        	answer += my_string.substring(c+(m*i)-1, c+(m*i));
        }
        return answer;
    }
}