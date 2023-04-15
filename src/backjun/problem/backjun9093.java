package backjun.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class backjun9093 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int N = Integer.parseInt(br.readLine());
//        while(N-- > 0){
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            while (st.hasMoreTokens()){
//                char[] arr = st.nextToken().toCharArray();
//                for (int i = 0; i <= (arr.length/2) - 1; i++) {
//                    char temp = arr[i];
//                    arr[i] = arr[arr.length - 1 - i];
//                    arr[arr.length - 1 - i] = temp;
//                }
//                sb.append(String.valueOf(arr) + " ");
//            }
//            sb.append("\n");
//        }
//        System.out.println(sb.toString());
//    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        while(N-- > 0){
            String[] strArr = br.readLine().split(" ");
            for(String str : strArr){
                StringBuilder reverse = new StringBuilder(str);
                sb.append(reverse.reverse());
                sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
