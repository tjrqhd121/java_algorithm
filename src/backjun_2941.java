import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjun_2941 {


    //1. 글자를 비교
    //2. 글자가 포함되어있으면 글자를 바꿈(*)
    //3. 포함된 글자가 없어질 때 까지 실행
    //4. 글자의 총 길이를 반환
    private static int getCroatiaLanguageCount(String s){
        int cnt = 0;
        String[] croatia = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        for(String var : croatia) {
            while (s.contains(var)) {
                s = s.replace(var, "*");
            }
        }
        cnt = s.length();
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int len = getCroatiaLanguageCount(s);
        System.out.println(len);
    }
}
