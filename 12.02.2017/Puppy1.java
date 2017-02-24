public class Puppy1{
	int puppy1Age;
	public Puppy1(String name){
		// This constructor has one parameter,name.
		System.out.println("Name chosen is:"+name);
}
public void setAge(int age){
	puppy1Age=age;
}
public int getAge(){
	System.out.println("Puppy1's age is :"+puppy1Age);
	return puppy1Age;
}
public static void main(String []args){
	/*Object creation */
	Puppy1 myPuppy1=new Puppy1("tommy");
	/*Call class method to set puppy's age */
	myPuppy1.setAge(2);
	/*Call another class method to get puppy1's age*/
	myPuppy1.getAge();
	/*You can access instance variable as follows as well */
	System.out.println("variable Value:"+myPuppy1.puppy1Age);
}
}