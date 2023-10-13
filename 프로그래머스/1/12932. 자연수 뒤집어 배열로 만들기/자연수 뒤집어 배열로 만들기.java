import java.util.*;

class Solution {
    public int[] solution(long n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(n > 0) {
        	list.add((int)(n%10));
        	n /= 10;
        }
        int[] tmp = new int[list.size()];
        for(int i=0; i<tmp.length; i++) {
        	tmp[i] = (int)(list.get(i));
        }
        return tmp;
    }
}