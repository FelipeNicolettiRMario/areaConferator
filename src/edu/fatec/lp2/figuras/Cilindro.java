package edu.fatec.lp2.figuras;

public class Cilindro implements Calculable {
	private double altura;
	private double raio;
	
	public Cilindro(final double altura, final double raio) {
		this.altura = altura;
		this.raio = raio;
		
	}

	@Override
	public double calcularArea() {
		return 2*Math.PI*raio*(altura + raio);
	}
}
