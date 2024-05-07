

import java.util.Random;
import java.util.Scanner;

public class JogoDaAdvinhacao2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Random random = new Random();//gerar numero aleatorio
		
		int opcao = 0;
		do {
			System.out.println("\nVoce gostaria de jogar novamente?");
			System.out.println("1 - Sim");
			System.out.println("9 - Não");
			opcao = entrada.nextInt();
			
			if (opcao == 1) {
				System.out.println("\nDigite o seu numero da sorte!");
				int numero = entrada.nextInt();
				int numeroAleatorio = random.nextInt(100) + 1;//vai gerar um numero de 0 a 100
				
				System.out.println("Numero Escolhido: " + numero);
				System.out.println("Numero Sorteado: " + numeroAleatorio);
				
				if (numero == numeroAleatorio) {
					System.out.println("Voce ganhou! Parabens!");
				}else {
					System.out.println("Infelizmente voce perdeu!");
				}
			}
		} while (opcao != 9);
		
		entrada.close();
	}
}
