import java.util.Scanner;

public class ex008 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senhaCorreta = 2002;
		
		System.out.println("Digite sua senha: ");
		int senha =  sc.nextInt();
		
		while (senha != senhaCorreta) {
			System.out.println("Senha inválida");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso permitido");
		
		sc.close();
	}

}
