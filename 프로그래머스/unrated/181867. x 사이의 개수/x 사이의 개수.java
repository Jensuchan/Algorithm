import java.util.ArrayList;

class Solution {
    public int[] solution(String myString) {
        int count = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i) == 'x'){
                list.add(count);
                count = 0;
            }else {
            	count++;
            }
            if(i == myString.length()-1) {
            	list.add(count);
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}