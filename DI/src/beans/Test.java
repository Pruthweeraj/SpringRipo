package beans;

public class Test {

	private String gender;
	

	public void setGender(String gender) {
		this.gender = gender;
	}



	public void details(String name) {
		System.out.println("HI..." + gender + "...." + name);
	}

}
