package test;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import business.Funcionario;

class FuncionarioTest {
	
	Funcionario funcionario;
	
	@Test
	@DisplayName("Testa se o salário pode ser menor do que o salário mínimo")
	void salarioMenorQueMinimo() {
		funcionario = new Funcionario();
		funcionario.setSalario(520.50);
		assertEquals(1000.00, funcionario.getSalario());
	}
	
	@Test
	@DisplayName("Testa se o relatório simplificado do funcionário é impresso corretamente")
	void imprimeRelatorio() {
		funcionario = new Funcionario();
		assertEquals("Nome: Shulambs - Cargo: Atendente - Salario: 1000.0", funcionario.imprimeRelatorioSimplificado());
	}


}
