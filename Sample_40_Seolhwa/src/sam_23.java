
public class sam_23 {
	public static void main(String[] args) {
		int arr[] = {59,52,56,58,51,54,57,55,50,53};
		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++ ) {
				if(arr[i] > arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		for(int i = 0 ; i < arr.length; i++)
			System.out.print(arr[i]+" ");
	}
}