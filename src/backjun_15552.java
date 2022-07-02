import java.io.*;
import java.util.*;
public class backjun_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;
        int len = Integer.parseInt(bufferedReader.readLine());
        for(int i=0; i<len; i ++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            bufferedWriter.write((Integer.parseInt(stringTokenizer.nextToken()))+Integer.parseInt(stringTokenizer.nextToken())+"\n");
        }
        bufferedWriter.close();
    }
}
