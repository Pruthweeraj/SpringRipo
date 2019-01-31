package test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Client {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Class  c =Class.forName("beans.Demo");
		Constructor constructor[] =c.getDeclaredConstructors();
		
		constructor[0].setAccessible(true);
		constructor[0].newInstance(null);
	}
}
