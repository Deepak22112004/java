class Refference{
	int a=10;
	public static void main(String args []){
		Refference t1=new Refference();
		Refference t2=t1;
		System.out.println(t1);
		System.out.println(t2.a);
		t1.a++;
		t2.a--;
		System.out.println(t1.a);
		System.out.println(t2.a);
	}
}

		
