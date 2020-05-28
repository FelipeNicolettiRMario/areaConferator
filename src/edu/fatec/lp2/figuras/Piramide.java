package edu.fatec.lp2.figuras;

public class Piramide implements Calculable{
	private double altura;
	private double base;
	
	public Piramide(final double altura,final double base) {
		this.altura = altura;
		this.base = base;
	}
	
	@Override
	public double calcularArea() {
		return (base * base) + (((4 * base) / 2) * altura);
	}
}
