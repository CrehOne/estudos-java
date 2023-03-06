import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1 = sc.nextInt();
		int qtPeca1 = sc.nextInt();
		double valorPeca1 = sc.nextDouble();
		
		int codigoPeca2 = sc.nextInt();
		int qtPeca2 = sc.nextInt();
		double valorPeca2 = sc.nextDouble();
		
		double totalAPagar = (qtPeca1 * valorPeca1) + (qtPeca2 * valorPeca2);
		
		System.out.printf("%d peças do modelo %d e mais %d peças do modelo %d ficam um total de R$ %.2f", qtPeca1, codigoPeca1, qtPeca2, codigoPeca2, totalAPagar);
		
		sc.close();

	}

}
