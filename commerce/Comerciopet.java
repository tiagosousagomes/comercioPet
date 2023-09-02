package commerce;
import java.util.Scanner;

import commerce.produto.Produto;
import commerce.produto.metodos;

import java.util.ArrayList;

public class Comerciopet {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      ArrayList < Produto > produtos = new ArrayList < Produto > ();
      metodos carregar = new metodos();

      System.out.println();
      System.out.println("					SISTEMA JAVAIPET \n");
      System.out.println("	" + "Bem vindo ao pet shop JAVAIPET, aqui você encontra diversos produtos para seu animalzinho \n 	de estimação. Ao realizar seu cadastro, você terá desconto de 20% na sua primeira compra. \n");
      System.out.print("	" + "Deseja realizar o cadastro? ");
      String cadastro = sc.nextLine();
      if (cadastro.equalsIgnoreCase("sim")) {

         carregar.cadastro();
      } 
      carregar.metodosComSleep();
     
     
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

            if (produtos.isEmpty()) {
               System.out.println();
               System.out.println("Nenhum produto cadastrado no sistema!");
               System.out.println();
            } else {
               for (Produto produto: produtos) {
                  System.out.println();
                  System.out.println(" - produto: " + produto.getNome() + " | código: " + produto.getCodigo() + " | estoque: " + produto.getQuantidadeEstoque());
                  System.out.println();
               }
            }
            break;

         case 2:

            System.out.println();
            System.out.print(" Nome do produto: ");
            String nomeProduto2 = sc.nextLine();
            produtoNovo.setNome(nomeProduto2);

            System.out.println();
            System.out.print(" Código do produto: ");
            int codigoProduto2 = Integer.parseInt(sc.nextLine());
            produtoNovo.setCodigo(codigoProduto2);

            System.out.println();
            System.out.print(" Deseja adicionar estoque ao produto? ");
            String addEstoque = sc.nextLine();

            if (addEstoque.equalsIgnoreCase("sim")) {
               System.out.println();
               System.out.print(" Quantidade de estoque: ");
               int estoqueProduto2 = Integer.parseInt(sc.nextLine());
               produtoNovo.setQuantidadeEstoque(estoqueProduto2);
               produtos.add(produtoNovo);
               carregar.metodosComSleep();
            } else {
               produtoNovo.setNome(nomeProduto2);
               produtoNovo.setCodigo(codigoProduto2);
               produtoNovo.setQuantidadeEstoque(0);
               produtos.add(produtoNovo);
               carregar.metodosComSleep();
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

               for (Produto produto: produtos) {
                  if (produto.getCodigo() == codigoProdutoExistente) {
                     System.out.println();
                     System.out.print(" Digite o novo valor do Estoque: ");
                     int novoValorDoEstoque = Integer.parseInt(sc.nextLine());
                     int estoqueAtual = produto.getQuantidadeEstoque() + novoValorDoEstoque;
                     produto.setQuantidadeEstoque(estoqueAtual);;
                     carregar.metodosComSleep();
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

            for (Produto produto: produtos) {

               if (produto.getCodigo() == codigoProdutoExistente) {
                  produtoRemover = produto;
               }
            }

            System.out.print(" Deseja remover o produto? ");
            String removerProduto = sc.nextLine();
            System.out.println();
            if (removerProduto.equalsIgnoreCase("sim")) {
               produtos.remove(produtoRemover);
               carregar.metodosComSleep();
            } else {
               carregar.metodosComSleepSaida();
            }
            break;

         case 5:

            System.out.println();
            System.out.print(" Digite o código do produto: ");
            int codigoDoProdutoExistente = Integer.parseInt(sc.nextLine());
            System.out.println();
            for (Produto produto: produtos) {
               if (produto.getCodigo() == codigoDoProdutoExistente) {
                  System.out.print(" Quantas unidades serão vendidas? ");
                  int unidadesVendidas = Integer.parseInt(sc.nextLine());
                  System.out.println();
                  int estoqueAtual = produto.getQuantidadeEstoque() - unidadesVendidas;
                  if (estoqueAtual >= 0) {
                     produto.setQuantidadeEstoque(estoqueAtual);
                     System.out.println();
                     System.out.println(" Sua venda foi realizada com sucesso! ");
                     carregar.metodosComSleep();

                  } else {
                     System.out.println(" venda invalida! ");
                  }
               }
            } break;
         case 6:
      	   System.out.println();
      	System.out.println("  Saindo...");
      	sc.close();
      	System.exit(0);
      	break;

      	default:
         
          //fim do switch
      } //fim do while
      }
      }
   }

