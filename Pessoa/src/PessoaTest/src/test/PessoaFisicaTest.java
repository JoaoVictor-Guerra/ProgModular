package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import business.Pessoa;
import business.PessoaFisica;

class PessoaFisicaTest {

	@Test
	@DisplayName("Chama o construtor padrão")
	void construtorPadrao() {
		PessoaFisica pessoa = new PessoaFisica();
		assertEquals("Shulambs", pessoa.getNome());
		assertEquals("Avenida Silva Lobo 283", pessoa.getEndereco());
		assertEquals("123456789", pessoa.getTelefone());
		assertEquals("12345-123", pessoa.getCep());
		assertEquals("Belo Horizonte", pessoa.getCidade());
		assertEquals("MG", pessoa.getUf());
		assertEquals("123.456.789-00", pessoa.getCpf());
		
	}
	
	@Test
	@DisplayName("Chama o construtor com valores passados pelo usuário")
	void construtorPersonalizado() {
		PessoaFisica pessoa = new PessoaFisica("Eren Yeager", "Shiganshina", "402323232", "12345-134", "Trost", "MG", "854-341-222-99");
		assertEquals("Eren Yeager", pessoa.getNome());
		assertEquals("Shiganshina", pessoa.getEndereco());
		assertEquals("402323232", pessoa.getTelefone());
		assertEquals("12345-134", pessoa.getCep());
		assertEquals("Trost", pessoa.getCidade());
		assertEquals("MG", pessoa.getUf());
		assertEquals("854-341-222-99", pessoa.getCpf());
	}

}
