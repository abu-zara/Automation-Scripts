package refreshJava;


public class someJavaStyffs {

	public static void main(String[] args) {

		int highScore = calculateScore(true, 800, 5, 100);
		System.out.println("your finalScore is " + highScore);

		highScore = calculateScore(true, 10000, 8, 200);
		System.out.println("your finalScore is " + highScore);
		
		
		int highScorePosition = calculateHighScorePosition(1500);
		displayHighSchoolPosition("Tim", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(900);
		displayHighSchoolPosition("bud", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(400);
		displayHighSchoolPosition("Mike", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(50);
		displayHighSchoolPosition("Jax", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(1000);
		displayHighSchoolPosition("Luise", highScorePosition);

		
		
	}

	public static int calculateScore(boolean gameOver, int score, int levelcompleted, int bonus) {
		if (gameOver) {
			int finalScore = score + (levelcompleted * bonus);
			finalScore += 2000;
			return finalScore;
		} else {
			return -1;
		}
	}

	public static void displayHighSchoolPosition(String playersName, int highScoreposition) {
		System.out.println(playersName + " manage to get into position " 
					+ highScoreposition + " on the high score table");

	}

	public static int calculateHighScorePosition(int playerScore) {
		if (playerScore >= 1000) {
			return 1;
		} else if (playerScore >= 500 && playerScore < 1000) {
			return 2;
		} else if (playerScore >= 100 && playerScore < 500) {
			return 3;
		} else {
			return 4;
		}

	}

}
