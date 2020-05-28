package edu.fatec.lp2.figuras;

public class Prisma implements Calculable{
	private double base;
	private double altura;
	private double nLados;
	
	public Prisma(final double base,final double altura,final double lados) {
		this.base = base;
		this.altura = altura;
		this.nLados = lados;
	}
	
	@Override
	public double calcularArea() {
		return base*((nLados * base * altura) + 3* altura);
	}
}
