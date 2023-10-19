package telran.reflection;

import java.lang.reflect.Method;

public class MethodCallByNameAppl {

	public static void main(String[] args) throws Exception {
		if(args.length < 1) {
			System.out.println("usage: argument must contain method name");
		} else {
			X obj = new X();
			Class<?> clazz =  obj.getClass();
		/*
		Method [] methods = clazz.getDeclaredMethods();
		for(Method method: methods) {
			System.out.println(method.getName());
		}
		*/
		/*
		Method method = clazz.getDeclaredMethod(args[0], int.class);
		System.out.println(method.getName());
		
		String res = (String) method.invoke(obj, 15);
		method.setAccessible(true);
		System.out.println (res);
		*/
		Method method = clazz.getDeclaredMethod(args[0], int.class);
		method.setAccessible(true);
		String res = (String) method.invoke(obj, 15);
		System.out.println(res);
	}
	
	}
	

	

}
