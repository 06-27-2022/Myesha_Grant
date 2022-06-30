
public class sumNum {
	public static void main(String[] args) {

		int [] numbers = new int []{3, 4, 332, 4, 3, 222, 402, 8392, 83, 
				2, 1, 244, 5, 4, 33, 842, 0, 0, 0, 2, 3, 4,
				0, 8871, 3, 1, 7, 9, 900, 1, 19, 23, 98, 89, 733, 437, 87, 98};
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++)
		{
			sum = sum + numbers[i];
		}
	System.out.println("Sum of all numbers: " +sum);

}
}
