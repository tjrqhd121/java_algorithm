package progrmmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class splitString {

    public static void main(String[] args){
        System.out.println(solution("aababvfvcddda"));
    }

    private static int solution(String s) {
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
}
