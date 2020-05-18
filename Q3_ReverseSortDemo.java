public class Q3_ReverseSortDemo{

	public static void main(String[] args){
		char[] unorderedLetters;
		unorderedLetters = new char[]{'b','m','z','a','u'};
		reverseSort(unorderedLetters);
		for(int i = 0; i < unorderedLetters.length; i++)
			System.out.println(unorderedLetters[i]);
	}

	
	public static void reverseSort(char[] values){

		for(int i = 0; i < values.length - 1; i++){
			int argMax = i;
			for(int j = i + 1; j < values.length; j++){
				
				if(values[j]>values[argMax]) {
					argMax = j;
				}
			}

			char tmp = values[argMax];
			values[argMax] = values[i];
			values[i] = tmp;
		}
	}
}
