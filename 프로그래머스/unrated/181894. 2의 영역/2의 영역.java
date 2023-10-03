class Solution {
    public int[] solution(int[] arr) {
        int count = 0;
        int start = 0;
        int end = 0;
        for(int i=0; i<arr.length; i++) {
        	if(arr[i] == 2) {
        		start = i;
        		break;
        	}
        }
        for(int i=0; i<arr.length; i++) {
        	if(arr[i] == 2) {
        		end = i;
        		count++;
        	}
        }
        if(count == 0) {
        	return new int[] {-1};
        }else if(count == 1) {
        	return new int[] {2};
        }else if(count > 1){
        	int[] answer  = new int[end-start+1];
        	for(int i=0; i<answer.length; i++) {
        		answer[i] = arr[start+i];
        	}return answer;
        }
        
        return null;
    }
}