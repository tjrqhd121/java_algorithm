package backjun.problem;

import java.util.Scanner;
import java.util.Stack;

public class backjun1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();
        int start = 0;
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            int input = sc.nextInt();
            if (start < input) {
                for (int j = start + 1; j <= input; j++) {
                    stack.push(i);
                    sb.append("+").append("\n");
                }
                start = input;
            }

            if (stack.peek() != input) {
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append("-").append("\n");
        }

        System.out.println(sb.toString());
    }
}
