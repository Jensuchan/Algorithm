class Solution {
    public int solution(int n) {
        int result = 1;
        int index = 1;
        
        while(result <= n) {
        	result *= index;
        	index++;
        }
        return index-2;
    }
}