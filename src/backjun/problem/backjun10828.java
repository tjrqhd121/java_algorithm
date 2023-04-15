package backjun.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class backjun10828 {

    private static int size = 0;
    private static int[] stack;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        stack = new int[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()){
                case "push" :
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop" :
                    sb.append(pop() + "\n");
                    break;
                case "size" :
                    sb.append(size() + "\n");
                    break;
                case "empty" :
                    sb.append(empty() + "\n");
                    break;
                case "top" :
                    sb.append(top() + "\n");
                    break;
            }
        }
        System.out.println(sb.toString());
    }

    private static void push(int item) {
        stack[size] = item;
        size++;
    }

    private static int pop(){
        if(size <= 0) {
            return -1;
        }

        int answer = stack[size - 1];
        stack[size - 1] = 0;
        size--;
        return answer;
    }

    private static int size(){
        return size;
    }

    private static int empty(){
        if(size <= 0){
            return 1;
        }
        return 0;
    }

    private static int top(){
        if(size <= 0){
            return -1;
        }
        return stack[size - 1];
    }
}
