package TiposPessoa;

import Pessoa.pessoaGeral;

public class fisica extends pessoaGeral{
	int cpf;

	@Override
	public String toString() {
		return "fisica [cpf=" + cpf + "]";
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
}
