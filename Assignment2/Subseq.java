package Assignment2;

public class Subseq {
	
	static int increment(int arr1[],int arrlength) {
	int seqarr[]=new int[arrlength];
	int i,j,max=0;
	for(i=0;i<arrlength;i++) {
		seqarr[i]=1;
	}
	for(i=0;i<arrlength;i++) { 
		for(j=0;j<i;j++){
			if(arr1[i]>arr1[j] && seqarr[i]<seqarr[j]+1)
				seqarr[i]=seqarr[j]+1;
		}
	}
	for(i=0;i<arrlength;i++){ 
		if(max<seqarr[i])
			max=seqarr[i];
	}
	return max;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {50,3,10,7,40,80};
		int arrlength=arr1.length;
		System.out.println("the length of the longest increasing subsequence is:"+increment(arr1,arrlength));

	}

}
