package progrmmers;

public class CenterString {
    public static void main(String[] args) {
            solution("abce");
    }


    public static String solution(String s) {
        String answer = "";
        int len = s.length();
        if(len % 2 == 0){
            answer = String.valueOf(s.charAt(len/2 - 1)) + String.valueOf(s.charAt(len/2));
        } else {
            answer = String.valueOf(s.charAt(len/2));
        }
        return answer;
    }
}

