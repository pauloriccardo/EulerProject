package project;

public class Project2 {

	public static void main(String[] args) {
		int fist = 1;
		int second = 1;
		int sum = 0;
		int fibonacci = 1;

		do {			
			fibonacci = fist + second;			
			fist = second;
			second = fibonacci;

			if (fibonacci % 2 == 0) {
				sum += fibonacci;
			}

		} while(fibonacci < 4000000);

		System.out.println(sum);
	}
}


