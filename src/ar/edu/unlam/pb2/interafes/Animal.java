package ar.edu.unlam.pb2.interafes;

public class Animal {
	private Integer peso;
	
	
	public Animal (Integer peso) {
		this.peso = peso;
	}


	protected Integer getPeso() {
		return peso;
	}


	protected void setPeso(Integer peso) {
		this.peso = peso;
	}
	
	
	protected Integer comer(Integer pesoComida) {
		return this.peso + pesoComida;
	}
	
}
