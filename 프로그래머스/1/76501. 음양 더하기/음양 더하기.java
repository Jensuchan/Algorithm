class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int[] tmp = new int[absolutes.length];
        for(int i=0; i<absolutes.length; i++) {
        	if(signs[i]==true) {
        		tmp[i] = absolutes[i];
        	}else {
        		tmp[i] = -absolutes[i];
        	}
        }
        int sum = 0;
        for(int i=0; i<tmp.length; i++) {
        	sum += tmp[i];
        }
        return sum;
    }
}