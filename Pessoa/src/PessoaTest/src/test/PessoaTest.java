package test;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import business.Funcionario;
import business.Pessoa;

class PessoaTest {
	
	Pessoa pessoa;
	
	@Test
	@DisplayName("Chama o construtor padrão")
	void construtorPadrao() {
		Pessoa pessoa = new Pessoa();
		assertEquals("Shulambs", pessoa.getNome());
		assertEquals("Avenida Silva Lobo 283", pessoa.getEndereco());
		assertEquals("123456789", pessoa.getTelefone());
		assertEquals("12345-123", pessoa.getCep());
		assertEquals("Belo Horizonte", pessoa.getCidade());
		assertEquals("MG", pessoa.getUf());
		
	}
	
	@Test
	@DisplayName("Chama o construtor com valores passados pelo usuário")
	void construtorPersonalizado() {
		Pessoa pessoa = new Pessoa("Vitoria", "Rua X", "232323232", "12345-124", "Ibirité", "MG");
		assertEquals("Vitoria", pessoa.getNome());
		assertEquals("Rua X", pessoa.getEndereco());
		assertEquals("232323232", pessoa.getTelefone());
		assertEquals("12345-124", pessoa.getCep());
		assertEquals("Ibirité", pessoa.getCidade());
		assertEquals("MG", pessoa.getUf());
	}
	
	@Test
	@DisplayName("Testa se é possível setar uma UF com mais de 2 letras")
	void ufMaiorQueDuasLetras() {
		Pessoa pessoa = new Pessoa();
		pessoa.setUf("MGRJSP");
		assertEquals("MG", pessoa.getUf());
	}
	
	@Test
	@DisplayName("Testa se é possível inserir um CEP com mais de 9 dígitos")
	void cepMaiorQueNove() {
		Pessoa pessoa = new Pessoa();
		pessoa.setCep("12345-1234");
		assertEquals("12345-123", pessoa.getCep());
	}
	
	@Test
	@DisplayName("Testa se o relatório da pessoa é impresso corretamente")
	void imprimeRelatorio() {
		pessoa = new Pessoa();
		assertEquals("Nome: Shulambs - Endereco: Avenida Silva Lobo 283 - Telefone: 123456789 - Cep: 12345-123 - Cidade: Belo Horizonte - Uf: MG", pessoa.imprimeRelatorio());
	}

	


}