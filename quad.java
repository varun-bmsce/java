import java.util.Scanner;

class Quad {
    int a, b, c;
    double d, root1, root2;
    void input() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = s.nextInt();
        System.out.print("Enter b: ");
        b = s.nextInt();
        System.out.print("Enter c: ");
        c = s.nextInt();
    }

    // Method to calculate the discriminant and roots
    void calculate() {
        d = (b * b) - (4 * a * c);  // Calculate discriminant

        if (d > 0) {
            root1 = (-b + Math.sqrt(d)) / (2 * a);
            root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are real and unequal: " + root1 + " and " + root2);
        } else if (d == 0) {
            root1 = -b / (2 * a);
            System.out.println("Roots are real and equal: " + root1);
        } else {
            System.out.println("Roots are imaginary.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Quad q = new Quad();
        q.input();         
        q.calculate();    
    }
}
