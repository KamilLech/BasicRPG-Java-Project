import java.util.Random;

public class Dice {

	private int diceType;
	private Random random;

	Dice(int diceType){
		this.diceType = diceType;
	}
	
	public int roll() {
	    random = new Random();
		return random.nextInt(this.diceType)+1;
	}
	
	public int roll(int diceAmount) {
		random = new Random();
		int total = 0;
		
		for (int i = 0; i < diceAmount; i++) {
			random = new Random();
			int result = random.nextInt(this.diceType)+1;
			total += result;
		}
		
		return total;
		
	}

	public int getMaxResult() {
		return diceType;
	}
}
