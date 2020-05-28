package edu.fatec.lp2.figuras;

public class Esfera implements Calculable{
	private double raio;
	
	public Esfera(final double raio) {
		this.raio = raio;
	}
	
	@Override
	public double calcularArea() {
		Circulo circulo = new Circulo(raio);
		
		return 4.0 * circulo.calcularArea();
	}
	
}
