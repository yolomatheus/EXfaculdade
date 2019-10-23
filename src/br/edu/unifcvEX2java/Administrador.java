package br.edu.unifcvEX2java;

public class Administrador extends Empregado {

	protected double AjudaDeCusto = 100;

	@Override
	public double CalcularSalario() {
		SalarioBase = SalarioBase + AjudaDeCusto;
		return super.CalcularSalario();
	}

}
