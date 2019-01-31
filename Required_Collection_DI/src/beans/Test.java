package beans;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import java.util.Vector;

public class Test {

	private Vector<String> frouts;
	private HashSet<String> languages;
	private Hashtable<String, String> smartPhones;

	public Vector<String> getFrouts() {
		return frouts;
	}

	public void setFrouts(Vector<String> frouts) {
		this.frouts = frouts;
	}

	public HashSet<String> getLanguages() {
		return languages;
	}

	public void setLanguages(HashSet<String> languages) {
		this.languages = languages;
	}

	public Hashtable<String, String> getSmartPhones() {
		return smartPhones;
	}

	public void setSmartPhones(Hashtable<String, String> smartPhones) {
		this.smartPhones = smartPhones;
	}

	public void printData(){
	
		System.out.println("Frouts...................");
		 for(String frout : frouts){
			 System.out.println(frouts);
		 }
		 
		 System.out.println("Languages...................");
		 for(String language : languages){
			 System.out.println(language);
		 }
		 
		 System.out.println("SmartPhines...................");
		 Set phones =smartPhones.keySet();
		 for(Object phone : phones){
			 System.out.println("SmartPhone:"+phone +"\n Price:"+smartPhones.get(phone));
		 }
		 
	}
	
	
}
