package backjun.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/**
 * 예외처리
 * 가로 최대 15, 세로 최대 5
 * 글자 작성시 공백 x
 * 글자는 A-Z, a-z, 0-9
 */

public class backjun10798 {
    public static void main(String[] args) throws IOException {
        System.out.println(solution());
    }

    private static String solution() throws IOException {
        StringBuilder answer = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        char[][] charArr = new char[5][15];

        for (int i = 0; i < charArr.length; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                if(max < str.length()) {
                    max = str.length();
                }
                charArr[i][j] = str.charAt(j);
    //                System.out.print(charArr[count][i]);
            }
//            System.out.println();
    }

        for (int i = 0; i <max; i++) {
            for (char[] chars : charArr) {
                if (chars[i] != '\0') {
                    answer.append(chars[i]);
                }
            }
        }

        return answer.toString();
    }

    private static String input() throws IOException {
        String str = null;
        try {
            String regex = "^[a-zA-z\\d]*$";    // 알파벳(대소문자) or 숫자
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            str = br.readLine();

            isRegex(str, regex);
            isMaxLength(str);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            input();
        }
        return str;
    }

    private static void isMaxLength(String str) throws Exception {
        if(str.length() > 15) {
            throw new Exception("최대 15자까지 입력 가능합니다.");
        }
    }

    private static void isRegex(String str, String regex) throws Exception {
        if (!Pattern.matches(regex, str)) {
            throw new Exception("알파벳(대소문자) 또는 숫자를 연속으로 입력하여 주십시오.");
        }
    }

}
