package progrmmers;
import java.lang.Math;
public class ReverseTernary {

    class Solution {
        public int solution(int n) {
            int answer = 0;
            String str = "";
            while(n > 0){
                str += Integer.toString(n % 3);
                n = n / 3;
            }
            int len = str.length();
            for(int i=0; i<len; i++){
                int x = str.charAt(i) - '0';
                answer += (Math.pow(3, len - 1 - i) * x);
            }

            return answer;
        }
    }

}
