package ar.edu.unlam.pb2.interafes;

import java.util.Comparator;

public class PorPesosComparador implements Comparator<Container> {

	@Override
	public int compare(Container con1, Container con2) {
		return con1.getPeso().compareTo(con2.getPeso()) ;
	}

}
