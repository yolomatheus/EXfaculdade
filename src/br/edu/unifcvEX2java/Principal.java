package br.edu.unifcvEX2java;

public class Principal {

	public static void main(String[] args) {

		Fornecedor F = new Fornecedor();

		F.setNome("Requinte");
		F.setEndere�o("Avenida Campos elisios");
		F.setTelefone("5056-5056");
		//F.setValorCredito(100);
		//F.setValorDivida(75);
		System.out.println("O nome do fornecedor �: " + F.getNome());
		System.out.println("O endere�o do fornecedor �: " + F.getEndere�o());
		System.out.println("O telefone do fornecedor �: " + F.getTelefone());
		System.out.println("O saldo do fornecedor �: " + F.ObterSaldo() + "\n");
		System.out.println("-----------------------------------------------");
		
		Empregado E = new Empregado();
		E.setCodigoSetor(1);
		E.setEndere�o("Rua Franciso Moraes");
		E.setNome("Julio Cezar");
		E.setTelefone("0505-0505");
		// E.setImposto(0.8);
		// E.setSalarioBase(1100);

		System.out.println("O nome deste empregado �: " + E.getNome());
		System.out.println("O endere�o deste empregado �: " + E.getEndere�o());
		System.out.println("O c�digo deste empregado �: " + E.getCodigoSetor());
		System.out.println("O telefone deste empregado �: " + E.getTelefone());
		System.out.println("O valor recebido pelo empregado �: " + E.CalcularSalario() + "\n");
		System.out.println("-----------------------------------------------");

		Administrador A = new Administrador();
		A.setNome("Hugo");
		A.setEndere�o("Rua ibirapuera");
		A.setTelefone("5050-5151");
		A.setCodigoSetor(2);
		//A.CalcularSalario();
		System.out.println("O nome do administrador �: " + A.getNome());
		System.out.println("O endere�o do administrador �: " + A.getEndere�o());
		System.out.println("O telefone do administrador �: " + A.getTelefone());
		System.out.println("O c�digo do administrador �: " + A.getCodigoSetor());
		System.out.println("O s�lario do administrador �: " + A.CalcularSalario() + "\n");
		System.out.println("-----------------------------------------------");
		Operario O = new Operario();
		
		O.setNome("Luiz");
		O.setEndere�o("Joaquim Barbosa");
		O.setTelefone("5274-1875");
		O.setCodigoSetor(3);
		//O.CalcularSalario();
		System.out.println("O nome do operario �: " + O.getNome());
		System.out.println("endere�o do operario �:" + O.getEndere�o());
		System.out.println("O telefone do operario �:" + O.getTelefone());
		System.out.println("O codigo do setor do operario �: " + O.getCodigoSetor());
		System.out.println("O salario do operario, com a comiss�o �: " + O.CalcularSalario() + "\n");
		System.out.println("-----------------------------------------------");
		
		Vendedor V = new Vendedor ();
		V.setNome("Pedro");
		V.setEndere�o("Rua pioneiro Jos� Ribas");
		V.setTelefone("8521-2025");
		V.setCodigoSetor(4);
		System.out.println("O vendedor se chama: " + V.getNome());
		System.out.println("O vendedor mora na rua: " + V.getEndere�o());
		System.out.println("O telefone do vendedor �: " + V.getTelefone());
		System.out.println("O codigo do setor �: " + V.getCodigoSetor());
		System.out.println("O salario do vendedor �: " + V.CalcularSalario());
		System.out.println("-----------------------------------------------");
	}

}
