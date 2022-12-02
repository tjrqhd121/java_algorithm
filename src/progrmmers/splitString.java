package progrmmers;

import java.util.ArrayList;
import java.util.List;

public class splitString {

    public static void main(String[] args){
        System.out.println(solutionV1("aababvfvcddda"));
        System.out.println(solutionV2("aababvfvcddda"));
    }

    private static int solutionV1(String s) {
        int answer = 0;

        List<Character> sameAlphabet = new ArrayList<>();
        List<Character> elseAlphabet = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if(sameAlphabet.size() == 0){
                sameAlphabet.add(s.charAt(i));
                continue;
            }

            if(sameAlphabet.contains(s.charAt(i))){
                sameAlphabet.add(s.charAt(i));
            } else {
                elseAlphabet.add(s.charAt(i));
            }

            if(sameAlphabet.size() == elseAlphabet.size()){
                answer++;
                sameAlphabet.clear();
                elseAlphabet.clear();
            }
        }

        if(sameAlphabet.size() != 0){
            answer++;
        }

        return answer;
    }

    /**
     * 속도 개선 및 리펙토링 버전
     */
    private static int solutionV2(String s){
        int answer = 0;
        int xCnt = 0;
        int elseCnt = 0;
        int x = ' ';

        for (int i = 0; i < s.length(); i++) {
            if(xCnt == 0){
                x = s.charAt(i);
                xCnt++;
                answer++;
                continue;
            }

            if(x == s.charAt(i)){
                xCnt++;
            } else {
                elseCnt++;
            }

            if(xCnt == elseCnt){
                xCnt = 0;
                elseCnt = 0;
            }
        }

        return answer;
    }
}
