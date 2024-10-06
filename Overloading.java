class Overloading{
	void add(){
		System.out.println("Hello");
	}
	void add(int a,int b){
		System.out.println(a+b);
	}
	void add(int p,int q,int r,int s){
		System.out.println(p+q+r+s);
	}
	public static void main(String args[]){
		Overloading t1= new Overloading();
        t1.add();
        t1.add(4,5);
        t1.add(4,5,6,7);
	}
}