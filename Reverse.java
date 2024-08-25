class Reverse{
	public static void main(String args[]){
		int a=135,sum=0,num;
		int temp;
		while(a!=0){
			num =a%10;
			sum=sum*10+num;
			a=a/10;
		}
		temp=sum;
		while(temp!=0){
			num=temp%10;
			System.out.println(num);
			temp=temp/10;
		}
	}
}