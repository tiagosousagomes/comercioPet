package commerce.produto;
import java.util.Scanner;
import java.util.ArrayList;

public class SistemaPet {
	 public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      ArrayList < Produto > listaDeprodutos = new ArrayList < Produto > ();
	      metodos carregar = new metodos();

	      System.out.println();
	      System.out.println("					SISTEMA JAVAIPET \n");
	      System.out.println("	" + "Bem vindo ao sistema JAVAIPET, um sistema de gerenciamento de lojas virtuais\n 	de estimação. Ao realizar seu cadastro, você terá desconto de 20% na sua primeira compra. \n");
	      System.out.print("	" + "Deseja realizar o cadastro? ");
	      String cadastro = sc.nextLine();
	      if (cadastro.equalsIgnoreCase("sim")) {

	         carregar.cadastro(); // cadastro do usuario
	      } 
	      carregar.metodosComSleep(); //função de carregamento de sistema
	     
	     
	      int opcao = 0;

	      while (true) {

	         Produto produtoNovo = new Produto();

	         System.out.println("       			┏━━━━━━━━━━━━━┓ ");
	         System.out.println("        	 	   MENU     ");
	         System.out.println("        		┗━━━━━━━━━━━━━┛ \n");

	         System.out.println("		[1] Listar todos os produtos \n");

	         System.out.println("		[2] Cadastrar novos produtos \n");

	         System.out.println("		[3] Adicionar estoque de produto \n");

	         System.out.println("		[4] Remover um produto \n");

	         System.out.println("		[5] Vender algum produto \n");

	         System.out.println("		[6] Sair do programa \n");

	         System.out.print("digite sua opção: ");

	         opcao = Integer.parseInt(sc.nextLine());

	         switch (opcao) {

	         case 1:

	            if (listaDeprodutos.isEmpty()) { //verifica se a arraylist contem elementos, se não conter nenhum elemento, retorna true, se conter, retorna false
	               System.out.println();
	               System.out.println("Nenhum produto cadastrado no sistema!");
	               System.out.println();
	            } else {
	               for (Produto itensDaLista: listaDeprodutos) { // a variavel produto vai rodar dentro do for e vai pegar o Nome, codigo e quantidade de estoque
	                  System.out.println();
	                  System.out.println(" - produto: " + itensDaLista.getNome() + " | código: " + itensDaLista.getCodigo() + " | estoque: " + itensDaLista.getQuantidadeEstoque());
	                  System.out.println();
	               }
	            }
	            break;

	         case 2:

	            System.out.println();
	            System.out.print(" Nome do produto: ");
	            String novoNomeProduto = sc.nextLine();
	            produtoNovo.setNome(novoNomeProduto);

	            System.out.println();
	            System.out.print(" Código do produto: ");
	            int novoCodigoProduto = Integer.parseInt(sc.nextLine());
	            produtoNovo.setCodigo(novoCodigoProduto);

	            System.out.println();
	            System.out.print(" Deseja adicionar estoque ao produto? ");
	            String adicionarEstoque = sc.nextLine();

	            if (adicionarEstoque.equalsIgnoreCase("sim")) {
	               System.out.println();
	               System.out.print(" Quantidade de estoque: ");
	               int novoEstoqueProduto = Integer.parseInt(sc.nextLine());
	               produtoNovo.setQuantidadeEstoque(novoEstoqueProduto);
	               listaDeprodutos.add(produtoNovo);
	               carregar.metodosComSleepAtualizando();
	            } else {
	               produtoNovo.setNome(novoNomeProduto);
	               produtoNovo.setCodigo(novoCodigoProduto);
	               produtoNovo.setQuantidadeEstoque(0);
	               listaDeprodutos.add(produtoNovo);
	               carregar.metodosComSleepAtualizando();
	            }
	            break;

	         case 3:
	            System.out.println();
	            System.out.print(" Deseja adicionar mais produto no estoque? ");
	            String adicionarProduto = sc.nextLine();

	            if (adicionarProduto.equalsIgnoreCase("sim")) {
	               System.out.println();
	               System.out.print(" Digite o código do produto: ");
	               int codigoProdutoExistente = Integer.parseInt(sc.nextLine());

	               for (Produto codigo: listaDeprodutos) {
	                  if (codigo.getCodigo() == codigoProdutoExistente) {
	                     System.out.println();
	                     System.out.print(" Digite o novo valor do Estoque: ");
	                     int novoValorDoEstoque = Integer.parseInt(sc.nextLine());
	                     int estoqueAtual = codigo.getQuantidadeEstoque() + novoValorDoEstoque;
	                     codigo.setQuantidadeEstoque(estoqueAtual);;
	                     carregar.metodosComSleepAtualizando();
	                  } else { carregar.metodosComErrorDeCodigo();
	                	
	                  }
	               }
	            } else {
	          
	               carregar.metodosComSleepSaida();
	            }
	            break;

	         case 4:


	             System.out.println();
	             System.out.print(" Digite o código do produto: ");
	             int codigoProdutoExistente = Integer.parseInt(sc.nextLine());
	             System.out.println();

	             Produto produtoRemover = new Produto();

	             for (Produto produto: listaDeprodutos) {

	                if (produto.getCodigo() == codigoProdutoExistente) {
	                   produtoRemover = produto;
	                   		System.out.print(" Deseja remover o produto? ");
	                   		String removerProduto = sc.nextLine();
	                   		System.out.println();
	                   		 if (removerProduto.equalsIgnoreCase("sim")) {
	                   		 listaDeprodutos.remove(produtoRemover);
	                   		 carregar.metodosComSleepAtualizando();}
	                   		 else {carregar.metodosComSleepSaida();}
	               }  
	                else if (produto.getCodigo() != codigoProdutoExistente) {
		                   produtoRemover = produto;
		                  carregar.metodosComErrorDeCodigo();}
	                
	      
	                		else {carregar.metodosComSleepSaida();}
	                break;}
	      
	             	
	             
	             break;

	         case 5:

	            System.out.println();
	            System.out.print(" Digite o código do produto: ");
	            int codigoDoProdutoExistente = Integer.parseInt(sc.nextLine());
	            System.out.println();
	            
	            for (Produto produto: listaDeprodutos) {
	            	
	               if (produto.getCodigo() == codigoDoProdutoExistente) {
	                  System.out.print(" Quantas unidades serão vendidas? ");
	                  int unidadesVendidas = Integer.parseInt(sc.nextLine());
	                  System.out.println();
	                  int estoqueAtual = produto.getQuantidadeEstoque() - unidadesVendidas;
	                  
	                  if (estoqueAtual >= 0) {
	                     produto.setQuantidadeEstoque(estoqueAtual);
	                     System.out.println();
	                     System.out.println(" Sua venda foi realizada com sucesso! ");
	                     carregar.metodosComSleepAtualizando();  
	                     } else {
	                     System.out.println(" venda invalida! ");
	                  }
	               }else {carregar.metodosComErrorDeCodigo();} 
	            } break;
	            
	         case 6:
	        	 
	      	   System.out.println();
	      	System.out.println("  Saindo do sistema...");
	      	sc.close();
	      	System.exit(0);
	      	break;

	      	default:
	         
	          //fim do switch
	         } //fim do while
	      }
	 }
}
