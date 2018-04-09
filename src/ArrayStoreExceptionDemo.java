import java.util.ArrayList;
import java.util.Arrays;

public class ArrayStoreExceptionDemo {
	public static void main(String[] args) {
		Integer[] intArray = new Integer[]{2, 3, 5, 7, 11, 13};
		//intArray[2] = 3.3;
		//Number[] numArray = intArray;
		//numArray[2] = 3.3;
		//doStuffToArray(intArray);
		for (Integer i : intArray)
			System.out.print(i + " ");
		
		//ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		//intArrayList.addAll(Arrays.asList(intArray));
		//ArrayList<Number> numArrayList = intArrayList;
		//numArrayList.set(2, 3.3);
		//doStuffToArrayList(intArray);
	}
	
	public static void doStuffToArray(Number[] numArray) {
		numArray[2] = 3.3;
	}
	
	public static void doStuffToArrayList(ArrayList<Number> numArrayList) {
		numArrayList.set(2, 3.3);
	}
}




