package phoneix_Java_Basic;

public class ArraysIntro {
	public static void main(String[] args) {

		int x = 10;

		int[] data = new int[5];
		data[0] = 10;
		data[1] = 20;
		data[2] = 30;
		data[3] = 40;
		data[4] = 50;

		
//		data[3] = 1010;
		System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(data[2]);
		System.out.println(data[3]);
		System.out.println(data[4]);
		
		System.out.println("--------------------------");
		
		
		
		
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		
		System.out.println("--------------------------");
		int [] data2 = {458,84,4,8,8,8,51,54,51,51,8,4,1,5,48,45,14,54,854,8,854,54,854,54};
		
		System.out.println(data2[6]);
		
		System.out.println(data2.length-1);
		for(int i = data2.length-1 ; i >= 0 ; i--) {
			System.out.println(data2[i]);
		}
		
		
		
		
	}
}
