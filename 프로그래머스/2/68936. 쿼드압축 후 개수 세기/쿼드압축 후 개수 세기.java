class Solution {
    public int[] solution(int[][] arr) {
        int[] answer = compress(arr, 0, 0, arr.length);
        return answer;
    }

    private int[] compress(int[][] arr, int x, int y, int n) {
        int[] result = new int[2];

        // 기저 사례: 정사각형 영역의 크기가 1x1인 경우
        if (n == 1) {
            result[arr[x][y]]++;
            return result;
        }

        int halfN = n / 2;
        int[] upperLeft = compress(arr, x, y, halfN);
        int[] upperRight = compress(arr, x, y + halfN, halfN);
        int[] lowerLeft = compress(arr, x + halfN, y, halfN);
        int[] lowerRight = compress(arr, x + halfN, y + halfN, halfN);

        // 압축된 결과를 합침
        result[0] = upperLeft[0] + upperRight[0] + lowerLeft[0] + lowerRight[0];
        result[1] = upperLeft[1] + upperRight[1] + lowerLeft[1] + lowerRight[1];

        // 모든 값이 0이면 [1, 0]을 반환하고, 모든 값이 1이면 [0, 1]을 반환
        if (result[0] == 0) {
            result[1] = 1;
        } else if (result[1] == 0) {
            result[0] = 1;
        }
        return result;
    }

}