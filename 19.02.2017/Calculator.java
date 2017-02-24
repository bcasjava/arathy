class Calculator{
	public int addNums(int num1,int num2){
		int a=0;
		int b=0;
		int c=0;
		a=num1;
		b=num2;
		int res=a+b;
		return res;
		
	}
	public int subNums(int num1,int num2)
	{
		return num1-num2;
	}
	public int mulNums(int num1,int num2)
	{
		return num1*num2; 
	}
	public int divNums(int num1,int num2)
	{
		return num1/num2; 
	}
	public int modNums(int num1,int num2)
	{
		return num1%num2; 
	}
	public static void main(String [] args)
	{
		int a=10;
		int b=20;
		
		Calculator cal=new Calculator();
		System.out.println("Sum of"+ a+"and " +b+"is: "+cal.addNums(a,b));
		System.out.println("sub of"+ a+"and " +b+"is: "+cal.subNums(a,b));
		System.out.println("mul of"+ a+"and " +b+"is: "+cal.mulNums(a,b));
		System.out.println("div of"+ a+"and " +b+"is: "+cal.divNums(a,b));
		
		
		
		
	}

	
	
	
}