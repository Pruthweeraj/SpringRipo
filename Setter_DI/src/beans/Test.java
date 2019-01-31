package beans;

public class Test {

	String name;
	int age;
	String eMail;
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	
	public void printData(){
		System.out.println("Name:"+name +"\nAge:"+age+"\neMail:"+eMail);
	}
}
