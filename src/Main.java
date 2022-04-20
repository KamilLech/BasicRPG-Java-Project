
public class Main {
	public static Theme theme = new Theme(false);
	public static void main(String[] args) {
		
		DiceBagWindow window = new DiceBagWindow(900, 500, "RPG");
		DiceBag diceBag = new DiceBag();
		Dice k100 = diceBag.getK100();
		int wynikRzutu;
		wynikRzutu = k100.roll();
		
		
	}

}
