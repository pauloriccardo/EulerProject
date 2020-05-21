package project;

public class Project1 {
	
	public static void main(String[] args) {
		double maxNumber = 1000;
		int sumMultiples = 0;
		
		for (int i = 3; i < maxNumber; i++) {
			if (i % 3 == 0 || i % 5 == 0) {				
				sumMultiples += i;
			}			
		}		
		System.out.println(sumMultiples);		
	}
}
