public class Q3_ArrayInsertionDemo{

	public static int[] insertIntoArray(int[] beforeArray, int indexToInsert, int valueToInsert){

		int[] afterArray;

		afterArray = new int[beforeArray.length + 1];

		for(int i = 0; i < indexToInsert; i++){
			afterArray[i] = beforeArray[i];
		}

		afterArray[indexToInsert] = valueToInsert;

		for(int i = indexToInsert; i < beforeArray.length; i++){
			afterArray[i+1] = beforeArray[i];
		}

		return afterArray;
	}

	public static void main(String[] args){
		int[] valuesArray;
		valuesArray = new int[]{1,5,4,7,9,6};
		System.out.println("Array before insertion:");
		for(int i = 0 ; i < valuesArray.length; i++){
			System.out.println(valuesArray[i]);
		}

		valuesArray = insertIntoArray(valuesArray,3,15);
		System.out.println("Array after insertion of 15 at position 3:");
		for(int i = 0 ; i < valuesArray.length; i++){
			System.out.println(valuesArray[i]);
		}

	}
}
