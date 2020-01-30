package br.com.executaveisedocumentacao;

import java.util.Scanner;
import br.com.modificadoresdeacesso.Cliente;
import br.com.modificadoresdeacesso.Conta;

public class Principal {
	static Cliente cliente = new Cliente("Rebeca Vitoria", "Rua amor da minha vida, 2");
	static Conta conta = new Conta(2, 600, 400, cliente);
	static Scanner teclado = new Scanner(System.in);
	
	public static void depositar() {
		System.out.println(" Deposito! ");
		System.out.println("Informe o valor para o deposito! ");
		
		float valor = teclado.nextFloat();
		
		if(valor > 0) {
			conta.depositar(valor);
			System.out.println("Deposito efetuado com sucesso! ");
		} else {
			System.out.println("O valor deve ser positivo! ");
			}
	}
	
	public static void sacar() {
		System.out.println("Saque!");
		System.out.println("Informe o valor para saque! ");
		
		float valor = teclado.nextFloat();
		
		if(valor > 0) {
			conta.sacar(valor);	
			
		} else {
			System.out.println("O valor precisa ser positivo! ");
		}
	}
	
	public static void consultar() {
		System.out.println("Seu saldo é " +  conta.getSaldo());
	}

	public static void main(String[] args) {
		int opcao = 0;
		System.out.println("Bem vindo ao Banco BR");
		
		do {
			System.out.println("Selecione uma opção: ");
			System.out.println("1 - Depositar ");
			System.out.println("2 - Sacar ");
			System.out.println("3 - Consultar Saldo ");
			System.out.println("0 - Sair ");
			opcao = teclado.nextInt();
			
			switch (opcao) {
			case 1:
				depositar();
				break;
			case 2:
				sacar();
				break;
			case 3:
				consultar();
				break;
			case 0:
				break;
				default:
					System.out.println("Opção inválida! ");
					break;
				}	
			
			} while(opcao > 0);
				teclado.close();
	}
}