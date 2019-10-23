package br.edu.unifcvEX2java;

public class Empregado extends Pessoa {

	protected double SalarioBase = 1100;
	protected int CodigoSetor;
	protected double Imposto = 150;

	public double CalcularSalario() {
		SalarioBase = SalarioBase - Imposto;
		
		return SalarioBase;
		
	}

	public double getSalarioBase() {
		return SalarioBase;
	}

	public void setSalarioBase(int salarioBase) {
		this.SalarioBase = salarioBase;
	}

	public int getCodigoSetor() {
		return CodigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.CodigoSetor = codigoSetor;
	}

	public double getImposto() {
		return Imposto;
	}

	public void setImposto(double imposto) {
		this.Imposto = imposto;
	}

}
