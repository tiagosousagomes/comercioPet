package commerce.produto;
import java.util.Scanner;

public class metodos {
 public void metodosComSleep() {
	 System.out.println();
		System.out.println("Iniciando o Sistema, aguarde... \n");
		
		  try {
	            Thread.sleep(1500); 
	        } catch (InterruptedException e) {
	          
	            e.printStackTrace();
	            
	        }
 }
 public void metodosComSleepAtualizando() {
	 System.out.println();
	 System.out.println();
		System.out.println("Atualizando o Sistema, aguarde... \n");
		
		  try {
	            Thread.sleep(1500); 
	        } catch (InterruptedException e) {
	          
	            e.printStackTrace();
	            
	        }
 }
 
 public void metodosComErrorDeCodigo() {
	 System.out.println();
	 System.out.println();
		System.out.println("codigo invalido!");
		
		  try {
	            Thread.sleep(1000); 
	        } catch (InterruptedException e) {
	          
	            e.printStackTrace();
	            
	        }
 }
 public void metodosComSleepSaida(){
	 System.out.println();
		System.out.println("Saindo... \n");
		
		  try {
	            Thread.sleep(1000); 
	        } catch (InterruptedException e) {
	          
	            e.printStackTrace();
	            
	        }
 }
 public void cadastro(){
	 
	 Scanner sc = new Scanner(System.in);

	 System.out.println();
		System.out.print("	Nome completo: ");
		String nome = sc.nextLine();

		
		System.out.print("	Idade: ");
		int idade = Integer.parseInt(sc.nextLine());
		
		;
		System.out.print("	e-mail: ");
		String email = sc.nextLine();
		System.out.println();

		System.out.println("\n 	Cadastro realizado com sucesso! \n");
 }}

