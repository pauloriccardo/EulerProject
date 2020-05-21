package project;

public class Project5 {

	public static void main(String[] args) {

		int n = 10;
		boolean ehDivisor = false;
		int maxNumber = 2;

		do {
			for( int i = 2; i <= n; i++) {
				if( maxNumber % i == 0) {
					ehDivisor = true;					
				} else {
					ehDivisor = false;
					maxNumber++;
					break;
				}
			}
		} while (!ehDivisor);

		System.out.println(maxNumber);

	}

}
