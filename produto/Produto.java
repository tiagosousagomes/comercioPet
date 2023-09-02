package commerce.produto;

public class Produto {
private int codigo;
	
	private String nome;
	
	private int quantidadeEstoque;

	public int getCodigo() {//Retorna o int codigo atualizada de setCodigo
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo; // pega o int codigo e transforma no valor que o setcodigo receber
	}

	public String getNome() { //Retorna a string nome atualizada de setNome
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome; // pega o string nome e transforma no valor que o setNome receber
	}

	public int getQuantidadeEstoque() { //Retorna o int quantidadeEstoque atualizada de setQuantidadeEstoque
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque; // pega o int quantiadeEstoque e transforma no valor que o setQuantiadeEstoque receber
	}
	
		
	
}
 