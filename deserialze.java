import java.util.*;
class deserialze{
static void inorder(int arr[], int ind ,int n){
	if(ind>=n)
		return;
	if(arr[ind]==-1)
		return;
	inorder(arr,ind*2+1,n);
	System.out.print(arr[ind]+ " ");
	inorder(arr,ind*2+2,n);
}

static int search(int arr[],int n,int val){
	for(int i=0;i<n;i++ ){
		if(arr[i]==val)
			return i;
	}
	return -1;
}



public static void main(String[]args){
	Scanner in  = new Scanner(System.in);
	int tmp=0;
	tmp = in.nextInt();
	while(tmp!=0){
		int n = in.nextInt();
		int k =  2*n;
		int arr[] = new int[k];
		Arrays.fill(arr,-1);

		in.nextLine();
		String str = in.nextLine();

		String kstr[] = str.split(" ");
		//System.out.println(kstr[0]);
		arr[0] = Integer.parseInt(kstr[0]);
		for(int i =0;i<n;i++){
			int a,b;
			a = Integer.parseInt(kstr[i*3+0]);
			b = Integer.parseInt(kstr[i*3+1]);
			int ind  = search(arr,k,a);
			if(ind==-1)
				System.exit(0);

			char c = kstr[i*3+2].charAt(0);
			//System.out.println(a+" "+b + " "+c);
			if(c=='L')
				arr[ind*2+1] = b;
			else
				arr[ind*2+2] = b;




		}

		inorder(arr,0,k);
		System.out.println();

		tmp--;
	}





}














}
