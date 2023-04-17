package ar.edu.unlam.pb2.interafes;

import java.util.Objects;



public class Container implements Comparable<Container> { //me faltaba esto
	private Integer peso;
	private Integer cantidadProdDentro;
	
	
	public Container (Integer peso, Integer productos) {
		this.peso=peso;
		this.cantidadProdDentro=productos;
	}


	protected Integer getPeso() {
		return peso;
	}


	protected void setPeso(Integer peso) {
		this.peso = peso;
	}


	protected Integer getCantidadProdDentro() {
		return cantidadProdDentro;
	}


	protected void setCantidadProdDentro(Integer cantidadProdDentro) {
		this.cantidadProdDentro = cantidadProdDentro;
	}


	@Override
	public int compareTo(Container o) {
		// TODO Auto-generated method stub
		return this.peso.compareTo(o.peso);
	}


	@Override
	public int hashCode() {
		return Objects.hash(peso);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Container other = (Container) obj;
		return Objects.equals(peso, other.peso);
	}



	
	
	
	
}
