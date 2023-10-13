import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        int min = arr[0];
        int index = 0;
        //길이가 1인배열은 -1로 리턴
        if(arr.length==1) {
        	int[] tmp = new int[] {-1};
        	return tmp;
        }
        //최소값과 인덱스 계산
        for(int i=0; i<arr.length; i++) {
        	if(min>=arr[i]) {
        		min = arr[i];
        		index = i;
        	}
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++) {
        	if(i == index) {
        		continue;
        	}
        	list.add(arr[i]);
        }
        for(int i=0; i<answer.length; i++) {
        	answer[i] = list.get(i);
        }
        return answer;
    }
}