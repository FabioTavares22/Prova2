package Estoque;

public class produto {
	String nome;
	int valor;
	int quantidade;
	@Override
	public String toString() {
		return "produto [nome=" + nome + ", valor=" + valor + ", quantidade=" + quantidade + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
