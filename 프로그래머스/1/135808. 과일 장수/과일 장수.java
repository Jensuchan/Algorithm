import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score); //오름차순정리
        int index = 0;
        //score가지고 내림차순만들기
        //tmp는 내림차순 (가장 큰값부터 정렬)
        //4 4 4 4 4 4 2 2 2 2 1 1 // length= 12
        //if m=5;
        //0 1 2 3 4 5 6 7 8 9
        int[] tmp = new int[score.length];
        for(int a : score) {
        	tmp[index] = score[score.length-index-1];
        	index++;
        }
        index = 1;
        int a = tmp.length;
        int tmp1 = m-1;
        while(a >= m) {
        	answer += m * tmp[(m*index)-1];
        	a -= m;
        	index++;
        }
        return answer;
    }
}