
public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println("The Prime Numbers are:");
	
		printPrimeBetween(1,50);

	}
	public static boolean isPrime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void printPrimeBetween(int start, int end) {
		for(int i=start;i<=end;i++) {
			if(isPrime(i))
				System.out.print(i+" ");
		}
		
	}
		
	
}
