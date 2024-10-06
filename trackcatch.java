class trackcatch{
	public static void main(String args[]){
		int a=10,b=0,c;
		try{
			c=a/b;
			System.out.print(c);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		System.out.print("Bye");
	}
}

			