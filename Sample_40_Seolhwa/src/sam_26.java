
public class sam_26 {
	public static void main(String[] args) {
		
		int arr[] = {71,78,70,75,77,76,79,72,74,73};
		for(int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j;
			int n = i - 1;
			
			for(j = n; j >= 0; j-- ) { 
				if(key < arr[j]) {
					arr[j+1] = arr[j];
				}
				else break;
			}
			arr[j+1] = key;
		}
		for(int i = 0 ; i < arr.length; i++)
			System.out.print(arr[i]+" ");
	}

}
