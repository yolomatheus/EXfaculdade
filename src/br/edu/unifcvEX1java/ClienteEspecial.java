package br.edu.unifcvEX1java;

public class ClienteEspecial extends ContaCorrente {

	public void SaqueCE(double valor) {
		if (valor <= saldo) {
			saldo = saldo - valor - (valor * 0.1 / 100);
			System.out.println("Valor sacado: " + valor);
		} else {
			System.out.println("Saque negado");
		}
	}

}
