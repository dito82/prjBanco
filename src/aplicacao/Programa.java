package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import util.ContaBancaria;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaBancaria conta;
		
		System.out.print("Digite o número da conta: ");
		int numConta = sc.nextInt();
		
		System.out.print("Digite o nome do cliente: ");
		sc.nextLine();
		String nomeCliente = sc.nextLine();
		
		System.out.print("Tem depósito inicial (s/n): ");
		char resposta = sc.next().charAt(0);
		if(resposta == 'y') {
			System.out.print("Digite o depósito inicial");
			double depositoInicial = sc.nextDouble();
			conta = new ContaBancaria(numConta, nomeCliente, depositoInicial);
		} else {
			conta = new ContaBancaria(numConta, nomeCliente);
		}
		
		//DEPOSITANDO
		System.out.println();
		System.out.print("Digite um valor para depositar: ");
		double depositarValor = sc.nextDouble();
		conta.deposito(depositarValor);
		System.out.println("Saldo atualizado: ");
		System.out.println(conta);
		
		//SACANDO
		System.out.println();
		System.out.print("Digite um valor para sacar: ");
		double sacarValor = sc.nextDouble();
		conta.saque(sacarValor);
		System.out.println("Saldo atualizado: ");
		System.out.println(conta);
		
		sc.close();
	}

}
