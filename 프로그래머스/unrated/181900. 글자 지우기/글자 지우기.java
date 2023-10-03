import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        //1 16 6 15 0 10 11 3
        Arrays.sort(indices); //오름차순
        //16 15 11 10 6 3 1 0  apporoograpemmemprs
        for(int i=indices.length-1; i>=0; i--) {
        	int tmp = indices[i];
        	sb.deleteCharAt(tmp);
        }
        answer = sb.toString();
        return answer;
    }
}