public class Dog{
	public Dog(String name){
		// This constructor has one parameter,name.
		System.out.println("Passed Name is:"+name);
	}
	public Dog(String name1,String name2){
		// This constructor has one parameter,name.
		System.out.println("Passed Name is:"+name1);
		System.out.println("Passed Name is:"+name2);
	}
	public static void main(String []args){
		//Following statement would create an object myPuppy
	Dog myDog=new Dog("tommy");
	Dog myDogs=new Dog("lucky","licca");
	
	}
}