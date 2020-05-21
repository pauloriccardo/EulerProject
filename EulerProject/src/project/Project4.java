package project;

public class Project4 {

	public static void main(String[] args) {
		int maxPalindromic = 0;
		int maxNumber = 999;

		for (int i = 100; i <= maxNumber; i++) {
			for ( int j = i; j <= maxNumber; j++) {
				String number = "";
				Integer currentNumber = i * j;

				String test = currentNumber.toString();				

				for ( int k = test.length(); k > 0; k--) {
					number += test.substring(k - 1, k);
				}				

				if (test.equalsIgnoreCase(number)) {
					if ( maxPalindromic < currentNumber ) {
						maxPalindromic = currentNumber;						
					}
				}
			}

		}		
		System.out.println(maxPalindromic);
	}

}

