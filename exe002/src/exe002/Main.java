package exe002;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		double area = 3.14159 * Math.pow(raio, 2);
		
		System.out.printf("Para um raio de %.2f a área é %.4f", raio, area);
		
		sc.close();

	}

}
