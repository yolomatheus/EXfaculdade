package br.edu.unifcvEX1java;

public class ContaCorrente {

	public double saldo;

	public void Depositar(double valor) {
		saldo = saldo + valor;
		System.out.println("Valor depositado: " + valor);
	}

	public void Sacar(double valor) {
		if (valor <= saldo) {
			saldo = saldo - valor - (valor * 0.5 / 100);
			System.out.println("Valor sacado: " + valor);
		} else {
			System.out.println("Saque negado");
		}

	}

	public void Saldo() {
		System.out.println("Saldo restante: " + saldo);
	}
}
