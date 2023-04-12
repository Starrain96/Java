package 프로그래머스기본;

class Solution111 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int n = (numer1 * denom2) + (numer2 * denom1);
        int d = denom1 * denom2;
        
        // 기본적으로 위에 구한 값을 n/d 를 하면 분수의 덧셈이 구해진다.
        // 하지만 기약분수로는 구해지지 않는다.
        // 예를 들어 1/2 + 3/4 를 하게 되면 정답은 10/8이 된다.
        // 하지만 우리가 원하는 답은 기약분수로 5/4이다.
        // 고로 기약분수로 만들어주는 과정이 필요하다.
        // 아래의 for 문은 기약분수를 만드는 것이다.
        
        for(int i=n-1; i>1; i--) { // 분자의 숫자보다 큰 값으로 나눠질 수는 없다 그래서 n-1 부터 시작한다.
            if(n % i == 0 && d % i == 0) { //분자와 분모가 동일한 값인 i로 나눠지고
                                            //이 행위를 반복하면 결국 공약수가 1인 기약분수가 만들어진다.
                n = n/i;
                d = d/i;
            }
        }
        
        int[] answer = {n,d};
        return answer;
    }
}