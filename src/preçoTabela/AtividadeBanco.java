package preçoTabela;

import java.util.Scanner;

public class AtividadeBanco {

	public static void main(String[] args) {
	Scanner caixa = new Scanner(System.in);
	
	float saldo = 1000.00f;
	
	System.out.println("Digite a operação desejada (1 - Saldo, 2 - Saque, 3 - Depósito):");
	int operacao = caixa.nextInt();
	
	switch (operacao) {
	            
	case 1:
		System.out.printf("Operação - Saldo%n");
		System.out.printf("Saldo: R$ %.2f%n", saldo);
	                break;
	                
	case 2:
		System.out.println("Valor: ");
		float valorSaque = caixa.nextFloat();
		if (valorSaque > saldo) {
			System.out.println("Operação - Saque");
			System.out.println("Saldo Insuficiente!");
	                } else {
	                	
	                	saldo -= valorSaque;
	                	System.out.printf("Operação - Saque%n");
	                	System.out.printf("Novo Saldo: R$ %.2f%n", saldo);
	                }
		break;
		
	case 3:
		System.out.println("Valor:");
		float valorDeposito = caixa.nextFloat();
		saldo += valorDeposito;
		
		System.out.printf("Operação - Depósito%n");
		System.out.printf("Novo Saldo: R$ %.2f%n", saldo);
		
		break;
		
	default:
		System.out.println("Operação Inválida!");
		
		break;
	        }
	
	caixa.close();
	
	}

}
