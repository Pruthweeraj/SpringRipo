package beans;

public class Test {

	String name;
	int age;
	String eMail;
	 
	
	private Test(String name, int age, String eMail) {
		super();
		this.name = name;
		this.age = age;
		this.eMail = eMail;
	}


	public void printData(){
		System.out.println("Name:"+name +"\nAge:"+age+"\neMail:"+eMail);
	}
}
