package br.edu.unifcvEX2java;

public class Vendedor extends Empregado {
	
	protected double ValorVendas = 100;
	protected double Comiss�o = 8.0;
	
	@Override
	public double CalcularSalario() {
		SalarioBase = SalarioBase  + ValorVendas * Comiss�o / 100;
		return super.CalcularSalario();
	}
}
