package ar.edu.unlam.pb2.interafes;

public class Superman extends Homosapien implements Volador{

	public Superman(Integer peso, Double altura) {
		super(peso, altura);
	}
	
	public Integer salvarPersona() {
		Integer contadorSalvadas =0;
		return contadorSalvadas++;
	}
	
	public Double saltarAlto(Integer metrosSaltados) {
		return super.getAltura()+metrosSaltados;
	}

	@Override
	public void despegar() {
		System.out.println("Estoy re loco, pegué un salto gigante.. ojo que me pongo a volar");
	}

	@Override
	public void aterrizar() {
		System.out.println("Caí re bien, no me hice mierda");
	}

	@Override
	public void volar() {
		System.out.println("Creo que estoy volando");
	}
	
	public void frenarBala() {
		System.out.println("Trabo fuerte y freno una bala");
	}

}
