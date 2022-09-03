package progrmmers;

public class MinimumRectangle {
    public static void main(String[] args) {
        int sizes[][] = {{60,50},{30,70},{60,30},{80,40}};
        solution(sizes);
    }

    private static int solution(int[][] sizes) {
        int answer = 0;
        int maxWidth = 0;
        int maxLength = 0;

        for (int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] < sizes[i][1]){
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
        }

        for (int i = 0; i < sizes.length; i++) {
            maxWidth = Math.max(maxWidth,sizes[i][0]);
            maxLength = Math.max(maxLength,sizes[i][1]);
        }

        answer = maxWidth * maxLength;
        return answer;
    }
}
