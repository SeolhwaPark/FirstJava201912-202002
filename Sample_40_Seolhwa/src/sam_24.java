
public class sam_24 {
	public static void main(String[] args) {
		int arr[] = {59,52,56,58,51,54,57,55,50,53};
		
		for(int i = 0; i < arr.length-1; i++) {
			int n = arr.length-i-1;//a.length-i-1 �� ���ִ� ������ ù���� �˻翡�� ���� ū���� �ǵڷ� ���� ��
			for(int j = 0; j < n; j++ ) {
				if(arr[j] > arr[j+1]) {
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
		}
		for(int i = 0 ; i < arr.length; i++)
			System.out.print(arr[i]+" ");
	}
}