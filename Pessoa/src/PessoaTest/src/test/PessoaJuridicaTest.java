package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import business.Pessoa;
import business.PessoaJuridica;

class PessoaJuridicaTest {

	@Test
	@DisplayName("Chama o construtor padrão")
	void construtorPadrao() {
		PessoaJuridica pessoa = new PessoaJuridica();
		assertEquals("Shulambs", pessoa.getNome());
		assertEquals("Avenida Silva Lobo 283", pessoa.getEndereco());
		assertEquals("123456789", pessoa.getTelefone());
		assertEquals("12345-123", pessoa.getCep());
		assertEquals("Belo Horizonte", pessoa.getCidade());
		assertEquals("MG", pessoa.getUf());
		assertEquals("213-5", pessoa.getCnpj());
		
	}
	
	@Test
	@DisplayName("Chama o construtor com valores passados pelo usuário")
	void construtorPersonalizado() {
		PessoaJuridica pessoa = new PessoaJuridica("Walter White", "Rua Z", "232323232", "12345-124", "Albuquerque", "NM", "214-8");
		assertEquals("Walter White", pessoa.getNome());
		assertEquals("Rua Z", pessoa.getEndereco());
		assertEquals("232323232", pessoa.getTelefone());
		assertEquals("12345-124", pessoa.getCep());
		assertEquals("Albuquerque", pessoa.getCidade());
		assertEquals("NM", pessoa.getUf());
		assertEquals("214-8", pessoa.getCnpj());
	}

}
