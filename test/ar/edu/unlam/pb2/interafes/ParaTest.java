package ar.edu.unlam.pb2.interafes;

import org.junit.Assert;
import org.junit.Test;

public class ParaTest {

//	@Test
//	public void queLaBarcazaTenga3Containers() throws ExceptionExcedeCantidad, ExceptionExcedePeso {
//		Vehiculo barcaRio = new Barcaza("Azul", 5, 5, 100);
//		Container caja = new Container (40, 100);
//		((Barcaza)barcaRio).agregarContainers(caja);
//		((Barcaza)barcaRio).agregarContainers(caja);
//		((Barcaza)barcaRio).agregarContainers(caja);
//		Integer vo = ((Barcaza)barcaRio).getConteiners();
//		Integer ve= 3;
//		Assert.assertEquals(ve, vo);
//	}
//		
//		@Test (expected = Exception.class)
//	public void noCargarMasPesosDeLoPermitido1() throws ExceptionExcedeCantidad, ExceptionExcedePeso {
//		Vehiculo barcaRio = new Barcaza("Azul", 5, 3, 100);
//		Container caja = new Container (40, 100);
//		((Barcaza)barcaRio).agregarContainers(caja);
//		((Barcaza)barcaRio).agregarContainers(caja);
//		((Barcaza)barcaRio).agregarContainers(caja);
//	}
//		
//		
//		@Test 
//		public void noCargarMasContainersDeLoPermitido1()  {
//			Vehiculo barcaRio = new Barcaza("Azul", 5, 2, 100);
//			Container caja = new Container (20, 100);
//			
//			try {
//				((Barcaza)barcaRio).agregarContainers(caja);
//				((Barcaza)barcaRio).agregarContainers(caja);
//				((Barcaza)barcaRio).agregarContainers(caja);
//			} catch (ExceptionExcedeCantidad e) {
//				// TODO Auto-generated catch block
//				System.out.println("El error 1 es " + e.getMessage());
//			} catch (ExceptionExcedePeso e) {
//				// TODO Auto-generated catch block
//				System.out.println("El error 2 es " + e.getMessage());
//			}
//		}
//	
//	
//		
		@Test
		public void mostrarLosPaquetesPorPeso() {
			Barcaza barcaRio = new Barcaza("Azul", 5, 6, 10000);
			Container caja = new Container (10, 100);
			Container caja1 = new Container (12, 200);
			Container caja2 = new Container (15, 400);
			Container caja3 = new Container (20, 600);
			barcaRio.agregarContainers2(caja);
			barcaRio.agregarContainers2(caja1);
			barcaRio.agregarContainers2(caja2);
			barcaRio.agregarContainers2(caja3);
			Integer primeroObtenido = barcaRio.ordenarPorPeso().first().getPeso();
			Integer ultimoObtenido = barcaRio.ordenarPorPeso().last().getPeso();
			Integer primeroEsperado= 10;
			Integer ultimoEsperado= 20;
			Assert.assertEquals(primeroEsperado, primeroObtenido);
			Assert.assertEquals(ultimoEsperado, ultimoObtenido);
		}
		
		
	
		
		
	
// ordenar los paquetes por peso, ordenar a los integrantes de los vehículos por peso / ver lo de comparable
		
}
