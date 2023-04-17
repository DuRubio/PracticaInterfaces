package ar.edu.unlam.pb2.interafes;

import java.util.TreeSet;


public class Vehiculo {
	private String color;
	private TreeSet<Animal> personasDentro;
	private Integer cantidadPersonasMaximo;
	
	
	
	public Vehiculo (String color, Integer cantidadPersonasMaximo) {
		this.color=color;
		this.cantidadPersonasMaximo=cantidadPersonasMaximo;
		this.personasDentro = new TreeSet <Animal> ();
	}



	protected String getColor() {
		return color;
	}



	protected void setColor(String color) {
		this.color = color;
	}



	protected Integer getCantidadPersonasMaximo() {
		return cantidadPersonasMaximo;
	}
	
	
	protected Boolean agregarGente(Animal a) {
		return personasDentro.add(a);
		
	}
	
}
