import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0; i<numbers.length-1; i++) {
        	for(int j=i+1; j<numbers.length; j++) {
        		set.add(numbers[i]+numbers[j]);
        	}
        }
        int index=0;
        int[] answer = new int[set.size()];
        for(int tmp : set) {
        	answer[index] = tmp;
        	index++;
        }
        Arrays.sort(answer);
        return answer;
    }
}