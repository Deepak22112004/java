class BinarySearch{
	public static void main (String args[]){
		int a[]={50,10,30,20,40,70,90,100,80,60},mid,low=0,high=a.length-1,temp;
		
		System.out.println("Before sort:");
		for(int i:a){
			System.out.print(i+"\t");
		}
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					temp=a[i];
				    a[i]=a[j];
				    a[j]=temp;
				}
			}
			
		}
		System.out.println();
		System.out.println("After sort:");
		for(int p:a){
			System.out.print(p+"\t");
		}
		int n=40;
		boolean f=false;
		while(low<=high){
			mid=(low+high)/2;
			if(a[mid]==n){
				f=true;
				break;
			}
			else if (n>a[mid]){
				low=mid+1;
			}
			else {
				high=mid-1;
			}
			
		}
		System.out.println();
		if(f){
			System.out.println("Element found at position at",);
		}
		else{
			System.out.println("Element not found");
		}
				
	}
}
		