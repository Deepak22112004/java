class Multitrymulticatch{
	public static void main(String args[]){
	int a=10,b=10,c,d[]={10,20,30};
	try{
		c=a/b;
		System.out.println(c);
	}
	catch(ArithmeticException e){
		System.out.println(e);
	}
	try {
		System.out.println(d[4]);
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println(e);
	}
	System.out.println("bye");
	}
}