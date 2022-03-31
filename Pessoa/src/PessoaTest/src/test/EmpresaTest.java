package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import business.Cliente;
import business.Empresa;
import business.Funcionario;
import business.PessoaFisica;

class EmpresaTest {
	
	Empresa empresa;
	
	@BeforeEach
	void init() {
		empresa = new Empresa();
	}

	@Test
	@DisplayName("Testa se é possível adicionar um presidente")
	void adicionaPresidente() {
		Funcionario presidente = new Funcionario();
		empresa.adicionaPresidente(presidente);
		assertEquals(presidente, empresa.getPresidente());
	}
	
	@Test
	@DisplayName("Testa se o número de funcionários aumenta ao ser adicionado")
	void aumentaNumFuncionarios() {
		Funcionario funcionario = new Funcionario();
		empresa.adicionaFuncionario(funcionario);
		assertEquals(1, empresa.numFuncionarios());
	}
	
	@Test
	@DisplayName("Testa se o número de clientes aumenta ao ser adicionado")
	void aumentaNumClientes() {
		Cliente cliente = new Cliente();
		empresa.adicionaCliente(cliente);
		assertEquals(1, empresa.numClientes());
	}

}
