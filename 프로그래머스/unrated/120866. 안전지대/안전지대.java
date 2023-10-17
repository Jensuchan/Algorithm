class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int n = board.length;
        int total = n * n;
        boolean safe = true;
        
        // i j k l
        for(int i=0; i<n; i++) {
        	for(int j=0; j<n; j++) {
        		if(board[i][j] == 0) {
        			safe = true;
        		}
        		//말이안되는경우 (가장자리)
        		for(int k=i-1; k<=i+1; k++) {
        			for(int l=j-1; l<=j+1; l++) {
        				if(k<0 || k>=n || l<0 || l>=n) {
        					continue; //가장자리에 있는경우
        				}
        				if(board[k][l] == 1) {
        					safe = false;
        					break;
        				}
        			}
        			if(!safe) {
        				break;
        			}
        		}
        		if(!safe) {
        			answer++;
        		}
        	}
        }
        return total-answer;
    }
}