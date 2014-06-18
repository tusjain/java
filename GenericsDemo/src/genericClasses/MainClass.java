package genericClasses;

import genericClasses.test.*;

public class MainClass {

	public static void main(String[] args) throws IllegalAccessException, InstantiationException {
		GenericFactory<MyClass> factory1 = new GenericFactory<MyClass>(MyClass.class);
		MyClass myClassInstance = factory1.createInstance();
		
		
		GenericFactory<YourClass> factory2 = new GenericFactory<YourClass>(YourClass.class);
		YourClass yourClassInstance = factory2.createInstance();
		
		GenericFactory<HerClass> factory3 = new GenericFactory<HerClass>(HerClass.class);
		HerClass herClassInstance = factory3.createInstance();

		/*
		GenericFactory<HisClass> factory4 = new GenericFactory<HisClass>(HisClass.class);
		HisClass hisClassInstance = factory4.createInstance();
		*/
	}

}
