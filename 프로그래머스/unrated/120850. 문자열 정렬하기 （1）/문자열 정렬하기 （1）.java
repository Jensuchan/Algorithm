import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        ArrayList<Character> list = new ArrayList<Character>();
        String[] tmp = my_string.split("");
        for(int i=0; i<my_string.length(); i++){
            if(Character.isDigit(my_string.charAt(i))){
                list.add(my_string.charAt(i));
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i)-'0';
        }
        Arrays.sort(answer);
        return answer;
    }
}