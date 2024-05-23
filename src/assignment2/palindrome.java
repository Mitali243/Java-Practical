package assignment2;

public class palindrome {

	public static void main(String[] args) {
int n = 1112222111; 
int m = n;
int rev = 0;
	while (n != 0) {
		            int x = n % 10;
		            rev = rev * 10 + x;
		            n /= 10;
		        }
		        if (m == rev) {
		            System.out.println(m + " is a palindrome.");
		        } else {
		            System.out.println(m + " is not a palindrome.");
		        }
		    }


	}

