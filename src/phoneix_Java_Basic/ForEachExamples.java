package phoneix_Java_Basic;

public class ForEachExamples {
	public static void main(String[] args) {
			
		
		int [] arr = {12,21,5,1,5,1,5,1,5};
		
		for(int i: arr) {
			System.out.println(i);
		}
		
		
		String data [] = {"v1", "v2", "v3"};
		
		for(String i: data) {
			System.out.println(i);
		}
		
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		
		
		System.out.println("-------------------------");
		
		String [] names = new String[5];
		
		names[0] = "Jack";
		names[1] = "David";
		names[2] = "Ana";
		names[3] = "Sam";
		names[4] = "Cory";
		
		
		
		for (String s : names) {
			System.out.println(s);
		}
		
		
		
		
	}
}
