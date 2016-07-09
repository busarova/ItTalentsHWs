
public class Task9 {

	public static void main(String[] args) {

		String text = "asd-12s-df45-56asdf100";
		String temp = "";
		int sum = 0;
		
		for (int i = 0; i < text.length(); i++) {

			if (text.charAt(i) == '-') {
				temp += " ";
			}
			temp += text.charAt(i);
		}
		temp = temp.replaceAll("\\D[A-Za-z]+|[A-Za-z]+|\\D[^-\\d]", " ").replaceAll("\\s+", " ").trim();
		System.out.println(temp);
		String[] arr = temp.split(" ");

		for (int i = 0; i < arr.length; i++) {
			sum += Integer.parseInt(arr[i]);
		}
		System.out.println(sum);
	}
}
