package br.edu.unifcvEX2java;

public class Operario extends Empregado{
	
	protected double comiss�o = 15;
	protected int ValorProdu��o = 100;
	
	@Override
	public double CalcularSalario() {
	SalarioBase = SalarioBase + ValorProdu��o * comiss�o /100;
		return super.CalcularSalario();
	}

}
