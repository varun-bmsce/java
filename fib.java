import java.util.Scanner;

class Fib{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number :");
	int n = sc.nextInt();
	System.out.println("\n----");
	int firstTerm = 0,secondTerm = 1;
	for (int i=1; i<=n ; i++){
		System.out.println(firstTerm+ " ");

	int nextTerm = firstTerm + secondTerm;

	firstTerm = secondTerm;
	secondTerm = nextTerm;
	}
   }
}