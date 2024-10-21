import java.util.Scanner;

class Prime{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
	int flag=0;
	System.out.println("Enter a number: ");
	int n = sc.nextInt();
	for(int i =2; i<n ; i++ ){
		if(n%i == 0){
			flag =1;
			break;
			}
	}
	if(flag==0){
		System.out.println("prime");
		}
	else{
		System.out.println("not prime");
		}
    }
}