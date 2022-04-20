
public class Main {
	public static Theme theme = new Theme(false);
	public static void main(String[] args) {
		
		Window window = new Window(900, 500, "RPG");
		DiceBag diceBag = new DiceBag();
		Dice k100 = diceBag.getK100();
		int wynikRzutu;
		wynikRzutu = k100.roll();
//		System.out.println("wynik rzutu: "+wynikRzutu);
//		CharacterSheet charater = new CharacterSheet("Bob", 22, 60, 50, 6);
//		System.out.println("Czy zdany test: "+charater.traitTest("dexterity", wynikRzutu));
	}

}
