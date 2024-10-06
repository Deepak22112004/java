class StaticF2{
	static int a=10;
	static void show(){
		System.out.println(a+5);
	}
	static{
		a=a*15;
		System.out.println(a);
	}
}
class StaticF{

	public static void main(String args[]){
		System.out.println("hello");
		System.out.println(StaticF2.a);
		StaticF2.show();
		System.out.println(StaticF2.a);
	}
}
	