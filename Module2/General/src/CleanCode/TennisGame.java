package CleanCode;

public class TennisGame {
    static String score = "";
    static int tempScore = 0;

    public static void draw(int player1Score) {
            switch(player1Score) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;
            }
    }
    public static  void checkWinner(int player1Score, int player2Score){
        int minusResult = player1Score - player2Score;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
    }
    public static void getScore(int play1Score, int player2Score){
        for (int i=1; i<3; i++)
        {
            if (i==1) tempScore = play1Score;
            else { score += "-"; tempScore = player2Score;}
            switch(tempScore)
            {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
    }}


    public static String matchResult(int player1Score, int player2Score) {
        if (player1Score == player2Score) {
            draw(player1Score);}
        else if (player1Score >= 4 || player2Score >= 4) {
            checkWinner(player1Score, player2Score);
        } else {
            getScore(player1Score,player2Score);
        }
        return score;
        }
}
