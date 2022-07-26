package progrmmers;

public class DivisorCountRefactoring {
    public static void main(String[] args) {
        int left = 13;
        int right = 17;
        int result = Solutions(left, right);
        System.out.println("result = " + result);
    }

    private static int Solutions(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            System.out.println(i % Math.sqrt(i));
            //제곱근으로 나눌 시 나머지가 0이면 약수의 개수는 홀수이다
            // -> 제곱근이 자연수일 때 약수의 개수는 홀수이다.
            if( i % Math.sqrt(i) == 0){
                answer -= i;
            }else{
                answer += i;
            }
        }
        return answer;
    }
}
