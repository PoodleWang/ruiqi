import java.util.*;

public class Solution {
    public static final String ROCK = "ROCK";
    public static final String PAPER = "PAPER";
    public static final String SCISSORS = "SCISSORS";

    public static final String[] strings = {
            ROCK,
            PAPER,
            SCISSORS,
    };
    public static void main(String[] args) {
        Random random = new Random();
        String computer = strings[random.nextInt(strings.length)];
        int player1Win = 0;
        int player2Win = 0;
        while (player1Win + player2Win < 3) {
            // 这里要check 一下 scanner输入是否合法
            Scanner myObj = new Scanner(System.in);

            // 记录输赢
            int result = Judge(myObj.next(), computer);
            if (result == 1) {
                player1Win ++;
            } else if (result == -1) {
                player2Win ++;
            }
            
            // 打印结果，你自己写
        }
    }

    public static int Judge(String player1, String player2) {
        if (player1.equals(SCISSORS) && player2.equals(PAPER)) {
            return 1;
        } else if (player1.equals(ROCK) && player2.equals(SCISSORS)) {
            return 1;
        } else if (player1.equals(PAPER) && player2.equals(ROCK)) {
            return 1;
        } else if  (player1.equals(ROCK) && player2.equals(PAPER)) {
            return -1;
        } else if (player1.equals(PAPER) && player2.equals(SCISSORS)) {
            return -1;
        } else if (player1.equals(SCISSORS) && player2.equals(ROCK)) {
            return -1;
        }  else if (player1.equals(ROCK) && player2.equals(ROCK)) {
            return 0;
        } else if (player1.equals(PAPER) && player2.equals(PAPER)) {
            return 0;
        } else { // SCISSORS VS SCISSORS
            return 0;
        }
    }
}
