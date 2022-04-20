import java.util.HashMap;
import java.util.Map;

public class  CharacterSheet {

	private String name;
	private int age;
	private int dexterity;
	private int intelligence;
	private int vitality;
	private DiceBag diceBag;
	Map<String, Integer> traints = new HashMap<String,Integer>();
	
	
	CharacterSheet(String name, int age, int dexterity, int intelligence, int vitality){
		this.name = name;
		this.age = age;
		this.dexterity = dexterity;
		this.intelligence = intelligence;
		this.vitality = vitality;
		
		traints.put("dexterity", dexterity);
		traints.put("intelligence", intelligence);
		traints.put("vitality", vitality);
		
		
	}
	private boolean isSuccess;
	public boolean traitTest(String traitName, int rolledNumber){
		Integer traitLevel = traints.get(traitName);
		if(rolledNumber <= traitLevel) {
			isSuccess = true;
		} else {
		 isSuccess = false;
		}
		return isSuccess;
	}
}
