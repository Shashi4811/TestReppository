package practisePackage;



class StringPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Swapping without third variable
		int x=2, y=3;
		System.out.println("Before swappiing x & y are :"+ x+" "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swappiing x & y are :"+ x+" "+y);*/
		int num=12345;
		int temp=0;
		while(num>0)
		{
			temp=(temp+(num%10))*10;
		}
		System.out.println(temp);
		System.out.println("bnm,");
		

	}

}
