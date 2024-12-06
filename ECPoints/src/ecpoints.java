import java.util.Scanner;
import java.lang.Math;

public class ecpoints {

	public static void main(String[] args) {
		
		// INPUT
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] nums = input.split(" ");
		// VARIABLES
		double p = Integer.parseInt(nums[0]);
		double a = Integer.parseInt(nums[1]);
		double b = Integer.parseInt(nums[2]);
		double y, c;
		
		
		// Loop through values of x
		for (int x = 0; x < p - 1; x++) {
			// Calculate c
			c = (Math.pow(x, 3) + (a * x) + b) % p;
			
			// Only 1 point on the curve
			if (c == 0) {
				y = 0;
				System.out.println((int)x + " " + (int)y);
			}
			
			else { // 2 points or none
				// Euler's method for calculating value of the Legendre symbol
				if (Math.pow(c, (p-1)/2)%p == 1) {
					
					// Determine the matching values of y
					if (p % 4 == 3) {
						// Given c^(p-1)/2 = 1 & p % 4 = 3
						
						y = Math.pow(c, (p + 1)/4)% p;
						double y2 = p - y;
						
						if (y < y2) {
							System.out.println((int)x + " " + (int)y);
							System.out.println((int)x + " " + (int)y2);
						} else {
							System.out.println((int)x + " " + (int)y2);
							System.out.println((int)x + " " + (int)y);
						}
					}
				}
			}
		}
	}
}