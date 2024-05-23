package assignment2;

public class primeNumber {

	public static void main(String[] args) {
int x = 50; 
int n = 2;
		        System.out.println("Prime numbers " + x + ":");
		        while (n <= x) 
		        {
		            if (isPrime(n)) {
		                System.out.print(n + " ");
		            }
		            n++;
		        }
		    }
		    public static boolean isPrime(int num) {
		        if (num <= 1) {
		            return false;
		        }
		        int i = 2;
		        while (i <= Math.sqrt(num)) {
		            if (num % i == 0) {
		                return false;
		            }
		            i++;
		        }
		        return true;
		    }	}


