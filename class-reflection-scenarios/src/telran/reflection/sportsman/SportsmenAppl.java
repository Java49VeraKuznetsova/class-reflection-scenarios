package telran.reflection.sportsman;

import java.lang.reflect.Constructor;

@SuppressWarnings("unchecked")
public class SportsmenAppl {

	private static final String BASE_PACKAGE = "telran.reflection.sportsman.";

	public static void main(String[] args) throws Exception{
		if(args.length < 2) {
			System.out.println("Too few arguments: must be name of class and constructor argument");
		} else {
			@SuppressWarnings("unchecked")
			Class<Sportsman> clazz = 
			(Class<Sportsman>) Class.forName(BASE_PACKAGE + args[0]);
	        Constructor<Sportsman> constructor = 
	        		clazz.getConstructor(String.class);
		    Sportsman sportsman = constructor.newInstance(args[1]);
		   System.out.println(" class name is " + clazz.getName());
		    sportsman.action();
		
		}

	}

}
