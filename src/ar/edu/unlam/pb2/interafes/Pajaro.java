package ar.edu.unlam.pb2.interafes;

public class Pajaro extends Animal implements Volador{
	
	private Integer cantidadDeHuevosPuestos;
	
	
	public Pajaro(Integer peso, Integer cantidadDeHuevosPuestos) {
		super(peso);
		this.cantidadDeHuevosPuestos=cantidadDeHuevosPuestos;
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void despegar() {
		System.out.println("Comencé a volar, soy un pajaro");
		
	}

	@Override
	public void aterrizar() {
		System.out.println("aterricé, soy un pajaro");
		
	}

	@Override
	public void volar() {
		System.out.println("Estoy volando, soy un pajaro");
		
	}
	
	public void construirNido() {
		System.out.println("Construyo mi nido");
	}
	
	public Integer ponerHuevo() {
		return cantidadDeHuevosPuestos++;
	}

}
