class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int max1 = 0;
        int min1 = 0;
        int max2 = 0;
        int min2 = 0;
        max1 = Math.max(dots[0][0], Math.max(dots[1][0], dots[2][0]));
        min1 = Math.min(dots[0][0], Math.min(dots[1][0], dots[2][0]));
        max2 = Math.max(dots[0][1], Math.max(dots[1][1], dots[2][1]));
        min2 = Math.min(dots[0][1], Math.min(dots[1][1], dots[2][1]));
        return (max1-min1)*(max2-min2);
    }
}