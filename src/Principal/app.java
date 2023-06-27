package Principal;

import java.util.Scanner;

import Estoque.produto;
import TiposPessoa.fisica;
import TiposPessoa.juridica;
import Venda.vendas;

public class app {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		do {
			menu();
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				registrarVenda();
				break;
			case 2:
				relatorioVendas();
				break;
			case 3:
				System.out.println("Obrigado por utilizar nosso sistema!");
				break;}
		}while(menu != 6);
	}
	
	private static void registrarVenda() {
		Scanner scan = new Scanner(System.in);
		Scanner scanInt = new Scanner(System.in);
		vendas objeto;
		int tipo = 0;
		int valor = 0;
		int doc = 0;
		int qtd = 0;
		String nome = null, endereco = null, produto = null;
		System.out.println("Informe 1 se o cliente for pessoa física e 2 se for jurídica:");
		tipo = scan.nextInt();
		if(tipo == 1) {
			fisica f = new fisica();
			produto p = new produto();
			System.out.println("Informe o nome da cliente: ");
			nome = scanInt.nextLine();
			f.setNome(nome);
			System.out.println("Informe o CPF do cliente: ");
			doc = scan.nextInt();
			f.setCpf(doc);
			System.out.println("Informe o endereço do cliente: ");
			endereco = scanInt.nextLine();
			f.setEndereco(endereco);
			System.out.println("Inform o nome do produto: ");
			produto = scanInt.nextLine();
			p.setNome(produto);
			System.out.println("Informe o valor do produto: ");
			valor = scan.nextInt();
			p.setValor(valor);
			System.out.println("Informe a quantidade vendida: ");
			qtd = scan.nextInt();
			p.setQuantidade(qtd);
		} else if(tipo == 2) {
			juridica j = new juridica();
			produto p = new produto();
			System.out.println("Informe o nome da cliente: ");
			nome = scanInt.nextLine();
			j.setNome(nome);
			System.out.println("Informe o CNPJ do cliente: ");
			doc = scan.nextInt();
			j.setCnpj(doc);
			System.out.println("Informe o endereço do cliente: ");
			endereco = scanInt.nextLine();
			j.setEndereco(endereco);
			System.out.println("Inform o nome do produto: ");
			produto = scanInt.nextLine();
			p.setNome(produto);
			System.out.println("Informe o valor do produto: ");
			valor = scan.nextInt();
			p.setValor(valor);
			System.out.println("Informe a quantidade vendida: ");
			qtd = scan.nextInt();
			p.setQuantidade(qtd);
		} else {
			System.out.println("Informe uma opção válida!");
		}
	}

	private static void relatorioVendas() {
		vendas v = new vendas();
		System.out.println("O valor de vendas total é: " + v.valorTotal());
		System.out.println("O valor médio de de vendas é: " + v.valorMedio());
		
	}

	public static void menu() {
		System.out.println("Menu de Opções");
		System.out.println("1- Registrar Venda");
		System.out.println("2- Gerar Relatório");
		System.out.println("3- Sair");
		System.out.println("Digite a opção desejada: ");
	}
}
