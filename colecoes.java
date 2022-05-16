/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o programa deverá atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
 */
package polimorfismoEcolecoes;

import java.util.ArrayList;
import java.util.Scanner;

public class colecoes {

	public static void main(String[] args) {
		int op;
		Scanner leia = new Scanner(System.in);
		ArrayList<String> estoque = new ArrayList();
		
		do
		{
			System.out.println("\n(1) Adicionar um produto ao estoque");
			System.out.println("\n(2) remover um produto do estoque");
			System.out.println("\n(3) Atulaizar um produto do estoque");
			System.out.println("\n(4) Mostrar todos os produtos do estoque");
			
			System.out.println("\nDigite a sua opção");
			op = leia.nextInt();
			
			switch(op)
			{
			case 1:
				leia.nextLine();
				System.out.println("\nDidite o nome do protudo que deseja adicionar");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
				
			case 2:
				leia.nextLine();
				leia.nextLine();
				System.out.println("\nDigite o produto que quer remover do estoque: ");
				String produtor = leia.nextLine();
				if(estoque.contains(produtor))
				{
					estoque.remove(produtor);
				}
				else
				{
					System.out.println("\nEsse produto não pertence ao estoque!");
				}
				System.out.println("\nEstoque depois da remoção do produto: ");
				System.out.println(estoque);
				break;
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o nome do produto que deseja atualizar: ");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o nome produto que substituirá o removido "+verifica+" : " );
				String novo = leia.nextLine();
				if(estoque.contains(verifica))
				{
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else
				{
					System.out.println("\nEsse produto não pertence ao estoque!");
				}
				break;
			case 4:
				System.out.println("\nOs itens do estoque são: ");
				System.out.println(estoque);
				break;
			case 0:
				System.out.println("\nFim do programa!");
				break;
				default:
					System.out.println("Opção inválida!");

				
			}
		}while (op!=0);

	}

}