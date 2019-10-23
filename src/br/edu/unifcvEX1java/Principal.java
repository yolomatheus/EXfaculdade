package br.edu.unifcvEX1java;

public class Principal {

	public static void main(String[] args) {

		System.out.println("CLIENTE NORMAL:");
		ContaCorrente CC = new ContaCorrente();
		CC.Depositar(100);
		CC.Sacar(50);
		CC.Saldo();

		System.out.println("\nCLIENTE ESPECIAL:");
		ClienteEspecial CE = new ClienteEspecial();
		CE.Depositar(100);
		CE.SaqueCE(50);
		CE.Saldo();
	}
}
