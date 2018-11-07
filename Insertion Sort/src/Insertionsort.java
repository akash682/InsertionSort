import java.util.*;


public class Insertionsort {
	public static void main(String[] args) {
		
		int size,i,j,n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the size of your array?");
		size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter an array.");
		for(i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		int pivot,hikaku,temp;
		
		for(i=1; i<size; i++) {
			pivot = arr[i];
			for(j=i-1; j>=0; j--) {
				hikaku = arr[j];
				if(pivot<hikaku) {
					if(j!=0) {
						continue;
					}else{
						for(n=i-1;n>=0;n--) {
							arr[n+1]=arr[n];
						}
						arr[0] = pivot;
						break;
					}
				}else{
					for(n=i-1;n>j;n--) {
						arr[n+1]=arr[n];
					}
					arr[j+1] = pivot;
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
}
