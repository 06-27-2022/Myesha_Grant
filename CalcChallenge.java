public class CalcChallenge{
	public static void main(String[] args) {
		System.out.println("Below is the 5 scores for: Math, English, Science, History, and Art.");
	//declare arrays
		int [] arr = {95, 85, 62, 40, 79};
		
		arr = new int[5];
		//assign grades to array integers
		arr[0] = 95;
		arr[1] = 85;
		arr[2] = 62;
		arr[3] = 40;
		arr[4] = 79;
		
		//print outcome
		System.out.println("Math: " +arr[0]);
		System.out.println("English: " +arr[1]);
		System.out.println("Science: " +arr[2]);
		System.out.println("History: " +arr[3]);
		System.out.println("Art: " +arr[4]);
		
	}
		
}
