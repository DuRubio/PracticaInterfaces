package ar.edu.unlam.pb2.interafes;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Barcaza extends Vehiculo implements Navegar {
	private Integer cantidadMaximaContenedores;
	private Integer cantidadMaximaPeso;
	private Integer pesoActual = 0;
	private Integer cantContenedoresActuales = 0;
	private TreeSet<Container> contenedores;

	public Barcaza(String color, Integer cantidadPersonasMaximo, Integer cantidadMaximaContenedores,
			Integer cantidadMaximaPeso) {
		super(color, cantidadPersonasMaximo);
		this.cantidadMaximaContenedores = cantidadMaximaContenedores;
		this.cantidadMaximaPeso = cantidadMaximaPeso;
		contenedores = new TreeSet<Container>();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aparcar() {
		System.out.println("Soy una barcaza y estoy aparcando");

	}

	@Override
	public void navegar() {
		System.out.println("Con " + getConteiners() + " conteiners, estamos navegando");

	}

	protected Integer getCantidadMaximaContenedores() {
		return cantidadMaximaContenedores;
	}

	protected void setCantidadMaximaContenedores(Integer cantidadMaximaContenedores) {
		this.cantidadMaximaContenedores = cantidadMaximaContenedores;
	}

	protected Integer getCantidadMaximaPeso() {
		return cantidadMaximaPeso;
	}

	protected void setCantidadMaximaPeso(Integer cantidadMaximaPeso) {
		this.cantidadMaximaPeso = cantidadMaximaPeso;
	}

	protected Boolean agregarContainers(Container contenedor) throws ExceptionExcedeCantidad, ExceptionExcedePeso {
		boolean pudo = false;
		
		if (cantContenedoresActuales == this.cantidadMaximaContenedores)
			throw new ExceptionExcedeCantidad("Excede la cantidad de contenedores permitidos");

		if (pesoActual > (this.cantidadMaximaPeso - contenedor.getPeso()))
			throw new ExceptionExcedePeso("Excede el peso máximo");

		contenedores.add(contenedor);
		cantContenedoresActuales++;
		pesoActual += contenedor.getPeso();
		pudo = true;

		return pudo;
	}
	
	public Boolean agregarContainers2(Container contenedor) {
		return contenedores.add(contenedor);
	}

	protected Integer getConteiners() {
		return contenedores.size();
	}
	
	public TreeSet<Container> ordenarPorPeso(){
		
	TreeSet<Container> porPesos = new TreeSet<Container>(new PorPesosComparador());
	porPesos.addAll(contenedores);
	return porPesos;
	}

}
