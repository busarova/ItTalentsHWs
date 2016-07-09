
public class task18 {

	public static void main(String[] args) {

		int[] arr1 = new int[] { 18, 19, 32, 1, 3, 4, 5, 6, 7, 8 };
		int[] arr2 = new int[] { 1, 2, 3, 4, 5, 16, 17, 18, 27, 11 };
		int[] resultArr = new int[arr1.length];

		System.out.println("Първият масив:");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.println("Вторият масив:");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		System.out.println("Резултатният масив:");
		for (int i = 0; i < resultArr.length; i++) {
			resultArr[i] = arr1[i] > arr2[i] ? arr1[i] : arr2[i];
			System.out.print(resultArr[i] + " ");
		}
	}

}
