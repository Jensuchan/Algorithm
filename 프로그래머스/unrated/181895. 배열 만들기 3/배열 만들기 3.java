class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int a = intervals[0][0]; //1
        int b = intervals[0][1]; //3
        int c = intervals[1][0]; //0
        int d = intervals[1][1]; //4
        int[] answer = new int[(b+d)-(a+c)+2];
        for(int i=0; i<answer.length; i++) {
        	if(a > b) {
        		answer[i] = arr[c];
        		c++;
        	}else {
        		answer[i] = arr[a];
        		// answer[0] = arr[1] a=2; answer[1] = arr[2] a=3; b=3;
        		// answer[2] = arr[3] a=4; 
        		a++;	
        	}
        }
        return answer;
    }
}