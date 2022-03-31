package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import business.Data;

class DataTest{

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void ConstrutorPadrao() {
		Data data = new Data();
		assertEquals(2022, data.getAno());
		assertEquals(3, data.getMeses());
		assertEquals(20, data.getDias());
	}
	
	@Test
	void ConstrutorPersonalizado() {
		Data data = new Data(2012, 4, 23);
		assertEquals(2012, data.getAno());
		assertEquals(4, data.getMeses());
		assertEquals(23, data.getDias());
	}
	
	@Test
	void AdicionaDias() {
		Data data = new Data(2022, 1, 1);
		data.adicionaDias(1);
		assertEquals(2, data.getDias());
		assertEquals(1, data.getMeses());
		assertEquals(2022, data.getAno());
	}
	
	@Test
	void AdicionaDiasPassagemMes() {
		Data data = new Data(2022, 1, 29);
		data.adicionaDias(3);
		assertEquals(1, data.getDias());
		assertEquals(2, data.getMeses());
		assertEquals(2022, data.getAno());
	}
	
	@Test
	void AdicionaDiasPassagemAno() {
		Data data = new Data(2022, 12, 5);
		data.adicionaDias(30);
		assertEquals(4, data.getDias());
		assertEquals(1, data.getMeses());
		assertEquals(2023, data.getAno());
	}
	
	@Test
	void ProximoDia() {
		Data data = new Data(2022, 1, 31);
		data.proximoDia();
		assertEquals(1, data.getDias());
		assertEquals(2, data.getMeses());
		assertEquals(2022, data.getAno());
	}
	
	@Test
	void AnoEBisexto() {
		Data data = new Data(1988, 7, 11);
		assertEquals(true, data.eAnoBisexto());	
	}
	
	@Test
	void AnoNaoEBisexto() {
		Data data = new Data(1989, 7, 11);
		assertEquals(false, data.eAnoBisexto());
		
	}
	
	@Test
	void TrintaDiasNoMes() {
		Data data = new Data(2025, 4, 10);
		assertEquals(30, data.diasNoMes());
	}
	
	@Test
	void TrintaUmDiasNoMes() {
		Data data = new Data(2025, 1, 10);
		assertEquals(31, data.diasNoMes());
	}
	
	@Test
	void VinteOitoDiasNoMes() {
		Data data = new Data(1992, 2, 4);
		assertEquals(28, data.diasNoMes());
	}
	
	@Test
	void VinteNoveDiasNoMes() {
		Data data = new Data(1993, 2, 4);
		assertEquals(29, data.diasNoMes());
	}
	
	@Test
	void imprimePorExtenso() {
		Data data = new Data(1993, 2, 4);
		assertEquals("4/2/1993", data.porExtenso());
	}
	
	
	


}
