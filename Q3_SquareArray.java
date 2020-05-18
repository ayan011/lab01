public class Q3_SquareArray{

	public static int[] createArray(int size) {
		int[] anArray;
		anArray = new int[size];
		for(int i = 0; i < size; i++){
			anArray[i] = i*i;
		}
		return anArray;
	}

	public static void main(String[] args){

		int[] anArray;
		anArray = createArray(13);


		for(int i = 0; i < anArray.length; i++){
			System.out.println("The square of " + i + " is: " + anArray[i]);
		}

	}
}
