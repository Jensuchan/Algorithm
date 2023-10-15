class Solution {
public static int solution(int n) {
    boolean[] isPrime = new boolean[n+1]; // 소수 여부를 저장하는 배열
    int count = 0; // 소수 개수를 저장하는 변수
    
    // 초기화
    for (int i = 2; i <= n; i++) {
        isPrime[i] = true; // 모든 수를 소수로 가정
    }
    
    // 에라토스테네스의 체 알고리즘
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (isPrime[i]) {
            for (int j = i * i; j <= n; j += i) {
                isPrime[j] = false; // i를 제외한 i의 배수들은 소수가 아님
            }
        }
    }
    
    // 소수 개수 세기
    for (int i = 2; i <= n; i++) {
        if (isPrime[i]) {
            count++;
        }
    }
    
    return count;
}

}