import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int result = (n1 * n2) - (n3 * n4);
		
		System.out.printf("A soma entre %d e %d menos a soma entre %d e %d é %d.", n1, n2, n3, n4, result);
		
		sc.close();

	}

}
