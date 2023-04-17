package ar.edu.unlam.pb2.interafes;

public class Hidroavion extends Aereoplano implements Navegar{
		private Integer litrosDeAguaDisparados;
	
	public Hidroavion(String color, Integer cantidadPersonasMaximo, Integer alturaMaxima, Integer litrosDeAguaDisparados) {
		super(color, cantidadPersonasMaximo, alturaMaxima);
		this.litrosDeAguaDisparados=litrosDeAguaDisparados;
		
	}

	@Override
	public void aparcar() {
		System.out.println("Soy un hidroavion, he aparcado");
		
	}

	@Override
	public void navegar() {
		System.out.println("Soy un hidroavion, estoy navegando");
		
	}

	protected Integer getLitrosDeAguaDisparados() {
		return litrosDeAguaDisparados;
	}

	protected void setLitrosDeAguaDisparados(Integer litrosDeAguaDisparados) {
		this.litrosDeAguaDisparados = litrosDeAguaDisparados;
	}

}
