package backjun.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class backjun_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase().trim();
        Map<String,Integer> map = new HashMap<>();

//        문자 중복제거 -> hashMap 자체가 중복을 제거하는데 굳이 필요한가?
//        char[] strToChar = str.toCharArray();
//        String distinctStr = "";
//        for (char c : strToChar) {
//            if(!distinctStr.contains(String.valueOf(c))){
//                distinctStr += c;
//            }
//        }

        // 초기화
        for (int i = 0; i <str.length(); i++) {
            map.put(String.valueOf(str.charAt(i)), 0);
        }

        // map<알파벳, 개수>
        for (int i = 0; i < str.length(); i++) {
            String mapKey = String.valueOf(str.charAt(i));
            map.put(mapKey, map.get(mapKey) + 1);
        }

        //value 최대값
        Integer maxValue = Collections.max(map.values());
        String maxString = "";

        for (String key : map.keySet()) {
            if(map.get(key).equals(maxValue)){
                maxString += key;
            }
            //가장많이 사용한 알파벳이 여러개 존재할 시
            if(maxString.length() >= 2){
                maxString = "?";
                break;
            }
        }
        System.out.println(maxString);
    }
}
