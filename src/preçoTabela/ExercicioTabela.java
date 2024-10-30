package preçoTabela;

import java.util.Scanner;

public class ExercicioTabela {

	public static void main(String[] args) {
		Scanner tabela = new Scanner (System.in);
		
		// Tabela de preços
		
		String produto = "";
		double precoUnitario = 0.0;
		
        System.out.print("Código do Produto: ");
		int codigoProduto = tabela.nextInt();
		
		System.out.print("Quantidade: ");
		int quantidade = tabela.nextInt();
		
		// Seleção do produto e preço
		
		switch (codigoProduto) {
		case 1:
			produto = "Cachorro Quente";
			precoUnitario = 10.00;
			break;
			
		case 2:
			produto = "X-Salada";
			precoUnitario = 15.00;
			break;
		            
		case 3:
			produto = "X-Bacon";
			precoUnitario = 18.00;
			break;
		            
		case 4:
			produto = "Bauru";
			precoUnitario = 12.00;
			break;
		            
		case 5:
			produto = "Refrigerante";
			precoUnitario = 8.00;
			break;
		            
		case 6:
			produto = "Suco de laranja";
			precoUnitario = 13.00;
			break;
			
		default:
		System.out.println("Código Inválido");
		tabela.close();
		return; // Encerre o programa se o código for inválido
		
		}
		
		// Cálculo do valor total
		
		double valorTotal = quantidade * precoUnitario;
		
		// Saída de dados
		System.out.printf("Produto: %s/", produto);
		System.out.printf("Valor total: R$ %.2f/", valorTotal);

		        tabela.close();

	}

}