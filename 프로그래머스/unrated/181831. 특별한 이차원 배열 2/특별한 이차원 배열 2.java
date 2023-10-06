class Solution {
    public int solution(int[][] arr) {
    	int[][] tmp = new int[arr.length][arr.length];
        int answer = 0;
        int count = 0;
        for(int i=0; i<tmp.length; i++) {
        	for(int j=0; j<tmp.length; j++) {
        		tmp[i][j] = arr[j][i];
        		if(tmp[i][j] == arr[i][j]) {
        			count++;
        		}
        	}
        }
        if(count == arr.length*arr.length) {
        	return 1;
        }

        return answer;
    }
}