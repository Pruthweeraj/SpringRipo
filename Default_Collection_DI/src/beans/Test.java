package beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	private List<String> frouts;
	private Set<String> languages;
	private Map<String, String> smartPhones;

	public List<String> getFrouts() {
		return frouts;
	}

	public void setFrouts(List<String> frouts) {
		this.frouts = frouts;
	}

	public Set<String> getLanguages() {
		return languages;
	}

	public void setLanguages(Set<String> languages) {
		this.languages = languages;
	}

	public Map<String, String> getSmartPhones() {
		return smartPhones;
	}

	public void setSmartPhones(Map<String, String> smartPhones) {
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
