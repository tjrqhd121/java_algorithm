package backjun.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class backjun10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(br.readLine());
        int answer = 0;
        while(st.hasMoreTokens()){
            if(Integer.parseInt(st.nextToken()) == v){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
