class Trackmulticatch{
	public static void main(String args[]){
		int a=10,b=0,c,d[]={10,20,30};
		try{
			c=a/b;
			System.out.print(c);
			System.out.println(d[3]);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		System.out.println("bye");
	}
}
