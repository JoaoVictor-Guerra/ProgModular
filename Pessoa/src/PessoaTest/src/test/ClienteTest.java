package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import business.Cliente;

class ClienteTest {

	@Test
	@DisplayName("Testa se � poss�vel adicionar limite de cr�dito")
	void adicionaLimite() {
		Cliente cliente = new Cliente();
		cliente.addCredito(150.50);
		assertEquals(150.50, cliente.getCredito());
	}
	
	@Test
	@DisplayName("Testa se � poss�vel o cr�dito ser negativo")
	void creditoNegativo() {
		Cliente cliente = new Cliente();
		cliente.setCredito(-100.0);
		assertEquals(0.0, cliente.getCredito());
	}
	

}
