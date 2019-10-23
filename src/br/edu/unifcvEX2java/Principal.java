package br.edu.unifcvEX2java;

public class Principal {

	public static void main(String[] args) {

		Fornecedor F = new Fornecedor();

		F.setNome("Requinte");
		F.setEndereço("Avenida Campos elisios");
		F.setTelefone("5056-5056");
		//F.setValorCredito(100);
		//F.setValorDivida(75);
		System.out.println("O nome do fornecedor é: " + F.getNome());
		System.out.println("O endereço do fornecedor é: " + F.getEndereço());
		System.out.println("O telefone do fornecedor é: " + F.getTelefone());
		System.out.println("O saldo do fornecedor é: " + F.ObterSaldo() + "\n");
		System.out.println("-----------------------------------------------");
		
		Empregado E = new Empregado();
		E.setCodigoSetor(1);
		E.setEndereço("Rua Franciso Moraes");
		E.setNome("Julio Cezar");
		E.setTelefone("0505-0505");
		// E.setImposto(0.8);
		// E.setSalarioBase(1100);

		System.out.println("O nome deste empregado é: " + E.getNome());
		System.out.println("O endereço deste empregado é: " + E.getEndereço());
		System.out.println("O código deste empregado é: " + E.getCodigoSetor());
		System.out.println("O telefone deste empregado é: " + E.getTelefone());
		System.out.println("O valor recebido pelo empregado é: " + E.CalcularSalario() + "\n");
		System.out.println("-----------------------------------------------");

		Administrador A = new Administrador();
		A.setNome("Hugo");
		A.setEndereço("Rua ibirapuera");
		A.setTelefone("5050-5151");
		A.setCodigoSetor(2);
		//A.CalcularSalario();
		System.out.println("O nome do administrador é: " + A.getNome());
		System.out.println("O endereço do administrador é: " + A.getEndereço());
		System.out.println("O telefone do administrador é: " + A.getTelefone());
		System.out.println("O código do administrador é: " + A.getCodigoSetor());
		System.out.println("O sálario do administrador é: " + A.CalcularSalario() + "\n");
		System.out.println("-----------------------------------------------");
		Operario O = new Operario();
		
		O.setNome("Luiz");
		O.setEndereço("Joaquim Barbosa");
		O.setTelefone("5274-1875");
		O.setCodigoSetor(3);
		//O.CalcularSalario();
		System.out.println("O nome do operario é: " + O.getNome());
		System.out.println("endereço do operario é:" + O.getEndereço());
		System.out.println("O telefone do operario é:" + O.getTelefone());
		System.out.println("O codigo do setor do operario é: " + O.getCodigoSetor());
		System.out.println("O salario do operario, com a comissão é: " + O.CalcularSalario() + "\n");
		System.out.println("-----------------------------------------------");
		
		Vendedor V = new Vendedor ();
		V.setNome("Pedro");
		V.setEndereço("Rua pioneiro José Ribas");
		V.setTelefone("8521-2025");
		V.setCodigoSetor(4);
		System.out.println("O vendedor se chama: " + V.getNome());
		System.out.println("O vendedor mora na rua: " + V.getEndereço());
		System.out.println("O telefone do vendedor é: " + V.getTelefone());
		System.out.println("O codigo do setor é: " + V.getCodigoSetor());
		System.out.println("O salario do vendedor é: " + V.CalcularSalario());
		System.out.println("-----------------------------------------------");
	}

}
