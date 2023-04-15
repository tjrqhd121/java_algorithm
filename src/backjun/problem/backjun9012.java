package backjun.problem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class backjun9012 {

//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int N = Integer.parseInt(br.readLine());
//
//        while(N-- > 0) {
//            Stack<Character> stack = new Stack<>();
//            try{
//                for(char ch : br.readLine().toCharArray()) {
//                    if(ch == '(') {
//                        stack.push(ch);
//                    } else if(ch == ')'){
//                        stack.pop();
//                    }
//                }
//                if(stack.empty()){
//                    sb.append("YES");
//                } else {
//                    throw new Exception();
//                }
//            } catch (Exception e){
//                sb.append("NO");
//            }
//            sb.append("\n");
//        }
//        System.out.println(sb);
//    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        while(N-- > 0) {
            String str = br.readLine();
            sb.append(solution(str)+"\n");
        }
        System.out.println(sb);
    }

    private static String solution(String str){
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray()){
            if(ch == '('){
                stack.push(ch);
            } else if(stack.empty()){
                return "NO";
            } else {
                stack.pop();
            }
        }

        if(stack.empty()){
            return "YES";
        }

        return "NO";
    }
}
