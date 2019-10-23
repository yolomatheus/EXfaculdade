package br.edu.unifcvEX2java;

public class Vendedor extends Empregado {
	
	protected double ValorVendas = 100;
	protected double Comissão = 8.0;
	
	@Override
	public double CalcularSalario() {
		SalarioBase = SalarioBase  + ValorVendas * Comissão / 100;
		return super.CalcularSalario();
	}
}
