package Venda;

public class vendas {
	String nome, endereco, produto;
	int tipo, doc;
	static int qtd;
	static int valor;
	static int valorVenda = valorTotal();
	@Override
	public String toString() {
		return "vendas [nome=" + nome + ", endereco=" + endereco + ", produto=" + produto + ", tipo=" + tipo + ", doc="
				+ doc + ", qtd=" + qtd + ", valor=" + valor + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public int getDoc() {
		return doc;
	}
	public void setDoc(int doc) {
		this.doc = doc;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
		
	public static int valorTotal() {
		int valorcalc = valor * qtd;
		
		return valorcalc;
	}
	
	public static int valorMedio() {
		int media = valorVenda / qtd;
		return media;
	}
}
