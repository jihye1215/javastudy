package prob1;

public class Sort {
	
	public static void main(String[] arg) {
	
		int data[] = { 5, 9, 3, 8, 60, 20, 1 };
		int count =  data.length;
		
		System.out.println( "Before sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print( data[ i ] + " " );
		}
		
		for(int i = 1; i < count; i++) {
			for(int j = 0; j < count - i; j++) {
				if(data[j] < data[j+1]) {
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
		}

		
		// 결과 출력
		System.out.println( "\nAfter Sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print(data[i] + " ");
		}		
	}
}