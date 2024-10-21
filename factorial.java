import java.util.Scanner;

class Factorial{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number :");
	int n = sc.nextInt();
	int s = 1;
	for(int i=1; i <=n ; i++){
		s = s * i;
	}
	System.out.println("Factorial of a given number is:"+s);
	sc.close();
    }
}