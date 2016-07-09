
public class Task2 {

	public static void main(String[] args) {
		int[][] arr = {
				{1,4,6,3},
				{5,9,7,2},
				{4,8,1,9},
				{2,3,4,5},				
		};
		System.out.print("Главен диагонал: ");
		for (int row = 0; row < arr.length; row++){
			for (int col = 0; col < arr[0].length; col++){
				if (row == col){
					System.out.print(arr[row][col] + " ");
				}
			}
		}
		System.out.println();
		System.out.print("Втори диагонал: ");
		for (int row = 0; row < arr.length; row++){
			for (int col = 0; col < arr[0].length; col++){
				if (row + col == arr.length-1){
					System.out.print(arr[row][col] + " ");
				}
			}
		}
	}

}
