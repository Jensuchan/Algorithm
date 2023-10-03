class Solution {
    public int[] solution(int[] num_list, int n) {
    	//길이 19 (0~18번지)
    	//11번째(10번지) 11번지~18번지까지
        int[] answer = new int[num_list.length];
        System.arraycopy(num_list, n, answer, 0, num_list.length-n);
        System.arraycopy(num_list, 0, answer, num_list.length-n, n);
        return answer;
    }
}