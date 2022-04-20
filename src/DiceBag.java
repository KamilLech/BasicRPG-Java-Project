
public class DiceBag {

	private Dice k4;
	private Dice k6;
	private Dice k8;
	private Dice k10;
	private Dice k12;
	private Dice k20;
	private Dice k100;
	
	DiceBag (){
	this.k4 = new Dice(4);
	this.k6 = new Dice(6);
	this.k8 = new Dice(8);
	this.k10 = new Dice(10);
	this.k12 = new Dice(12);
	this.k20 = new Dice(20);
	this.k100 = new Dice(100);
	}
	/**
	returns a 4-sided dice
	*/
	public Dice getK4() {
		return k4;
	}
	/**
	returns a 6-sided dice
	*/
	public Dice getK6() {
		return k6;
	}
	/**
	returns a 8-sided dice
	*/
	public Dice getK8() {
		return k8;
	}
	/**
	returns a 10-sided dice
	*/
	public Dice getK10() {
		return k10;
	}
	/**
	returns a 12-sided dice
	*/
	public Dice getK12() {
		return k12;
	}
	/**
	returns a 20-sided dice
	*/
	public Dice getK20() {
		return k20;
	}
	/**
	returns a 100-sided dice (originally built from two 10-sided dices or single Zocchihedron)
	*/
	public Dice getK100() {
		return k100;
	}
}
