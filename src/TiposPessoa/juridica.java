package TiposPessoa;

import Pessoa.pessoaGeral;

public class juridica extends pessoaGeral{
	int cnpj;

	@Override
	public String toString() {
		return "juridica [cnpj=" + cnpj + "]";
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
}
