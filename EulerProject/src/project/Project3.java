package project;

public class Project3 {

	public static void main(String[] args){			

		long number = 600851475143l;
		long control = 1l;
		long maxDivisor = 1l;

		for (long i = 2; i < number ; i++) {		
			if( isPrime(i) && number % i == 0) {
				maxDivisor = i;
				control *= i;				
			}
			if(control == number) {
				break;
			}
		}
		System.out.println(maxDivisor);
	}

	private static boolean isPrime(long n) {
		for (long j = 2; j < n; j++) {
			if (n % j == 0)
				return false;   
		}
		return true;
	}	

}
