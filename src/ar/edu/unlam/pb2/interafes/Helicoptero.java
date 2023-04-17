package ar.edu.unlam.pb2.interafes;

public class Helicoptero  extends Aereoplano{
	

	private Integer cantidadHelices;
	
	public Helicoptero(String color, Integer cantidadPersonasMaximo, Integer alturaMaxima, Integer cantidadHelices) {
		super(color, cantidadPersonasMaximo, alturaMaxima);
		this.cantidadHelices=cantidadHelices;
	}

	protected Integer getCantidadHelices() {
		return cantidadHelices;
	}

	protected void setCantidadHelices(Integer cantidadHelices) {
		this.cantidadHelices = cantidadHelices;
	}
	
	
	
	
}
