package ar.edu.unlam.pb2.interafes;

public class Aereoplano extends Vehiculo implements Volador{
	private Integer alturaMaximaPosible;

	public Aereoplano(String color, Integer cantidadPersonasMaximo, Integer alturaMaxima) {
		super(color, cantidadPersonasMaximo);
		this.alturaMaximaPosible = alturaMaxima;
	}

	public void despegar() {
		System.out.println("Soy un aereoplano y estoy despegando");
	}

	public void aterrizar() {
		System.out.println("Soy un aereoplano y estoy aterrizando");
	}

	public void volar() {
		System.out.println("Soy un aereoplano y estoy volando");
	}

	protected Integer getAlturaMaximaPosible() {
		return alturaMaximaPosible;
	}

	protected void setAlturaMaximaPosible(Integer alturaMaximaPosible) {
		this.alturaMaximaPosible = alturaMaximaPosible;
	}

	
	
	

}
