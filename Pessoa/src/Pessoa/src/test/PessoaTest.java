package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import business.Pessoa;

class PessoaTest {
	
	Pessoa pessoa;
	
	@Test
	@DisplayName("Chama o construtor padr�o")
	void construtorPadrao() {
		Pessoa pessoa = new Pessoa();
		assertEquals("Shulambs", pessoa.getNome());
		assertEquals("Avenida Silva Lobo 283", pessoa.getEndere�o());
		assertEquals("123456789", pessoa.getTelefone());
		assertEquals("12345-123", pessoa.getCep());
		assertEquals("Belo Horizonte", pessoa.getCidade());
		assertEquals("MG", pessoa.getUf());
		
	}
	
	@Test
	@DisplayName("Chamar o construtor com valores passados pelo usu�rio")
	void construtorPersonalizado() {
		Pessoa pessoa = new Pessoa("Vitoria", "Rua X", "232323232", "12345-124", "Ibirit�", "MG");
		assertEquals("Vitoria", pessoa.getNome());
		assertEquals("Rua X", pessoa.getEndere�o());
		assertEquals("232323232", pessoa.getTelefone());
		assertEquals("12345-124", pessoa.getCep());
		assertEquals("Ibirit�", pessoa.getCidade());
		assertEquals("MG", pessoa.getUf());
	}

	


}