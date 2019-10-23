package br.edu.unifcvEX2java;

public class Fornecedor extends Pessoa {

	protected int ValorCredito;
	protected int ValorDivida;

	public int ObterSaldo() {
		ValorCredito = ValorCredito - ValorDivida;
		// System.out.println(ValorCredito);
		return ValorCredito;
	}

	public int getValorCredito() {
		return ValorCredito;
	}

	public void setValorCredito(int valorCredito) {
		this.ValorCredito = valorCredito;
	}

	public int getValorDivida() {
		return ValorDivida;
	}

	public void setValorDivida(int valorDivida) {
		this.ValorDivida = valorDivida;
	}

}
