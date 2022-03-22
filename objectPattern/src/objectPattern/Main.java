package objectPattern;

public class Main {
	public static void main(String args[]) {
		int number[] = {0, 4, 2, 5, 1, 5, 3};
		for (int score : number) {
			if (score < 4) {
				System.out.println(score);	
			}
		}
	}
	
}
