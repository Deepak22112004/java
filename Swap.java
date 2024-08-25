class Swap{
	public static void main(String args[]){
		int a=10,b=20;
		System.out.println("value before swap of A " + a +" and B " + b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.print("value before swap of A "+a + " and B "+b);
	}
}