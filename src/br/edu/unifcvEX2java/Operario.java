package br.edu.unifcvEX2java;

public class Operario extends Empregado{
	
	protected double comissão = 15;
	protected int ValorProdução = 100;
	
	@Override
	public double CalcularSalario() {
	SalarioBase = SalarioBase + ValorProdução * comissão /100;
		return super.CalcularSalario();
	}

}
