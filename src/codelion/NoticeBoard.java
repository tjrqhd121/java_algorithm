package codelion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class NoticeBoard {
    public static void main(String[] args) throws IOException {
        List<Board> list = new ArrayList<>();
        boolean flag = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(flag){
            System.out.print("1.전체리스트 2.등록 0.종료>");
            int button = Integer.parseInt(br.readLine());
            switch (button){
                case 1:
                    System.out.println("== 게시풀 리스트 ==");
                    System.out.println("  no                title                 date");
                    for (Board board : list) {
                        System.out.println("   "+ board.getId() + "               " + board.getTitle() + "           " + board.getDateTime());
                    }
                    break;
                case 2:
                    System.out.print("제목:");
                    String title = br.readLine();
                    System.out.print("작성자:");
                    String name = br.readLine();
                    System.out.println("글이 추가 되었습니다.");
                    Board board = new Board(title,name,LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                    list.add(board);
                    break;
                case 0:
                    flag = false;
                    System.out.println("프로그램이 종료되었습니다.");
                    break;
                default:
                    break;
            }
        }
    }

    private static class Board {
        private int id = 0;
        private static int seq = 0;
        private String title;
        private String name;
        private String dateTime;

        public Board(String title, String name, String dateTime) {
            this.title = title;
            this.name = name;
            this.dateTime = dateTime;
            ++seq;
            this.id += seq;
        }

        public int getId() { return id; }

        public String getDateTime() {
            return dateTime;
        }

        public void setDateTime(String dateTime) {
            this.dateTime = dateTime;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
