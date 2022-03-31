package business;

public class Empresa {
	private PessoaFisica funcionarios[];
	private Cliente clientes[];
	private PessoaFisica presidente;
	
	public Empresa() {
	}
	
	// Getters e Setters
	
	public PessoaFisica getPresidente() {
		return this.presidente;
	}
	
	public void setPresidente(PessoaFisica presidente) {
		this.presidente = presidente;
	}
	
	// Métodos gerais
	
	public void adicionaFuncionario(Funcionario funcionario) {
		if(funcionarios == null) {
			funcionarios[0] = funcionario;
		}
		else {
		funcionarios[funcionarios.length + 1] = funcionario;
		}
	}
	
	public void adicionaCliente(Cliente cliente) {
		if(clientes == null) {
			clientes[0] = cliente;
		}
		else {
			clientes[clientes.length + 1] = cliente;
		}
	}
	
	public void adicionaPresidente(Funcionario presidente) {
		if(getPresidente() == null) {
			setPresidente(presidente);
		}
	}
	
	public int numFuncionarios() {
		return funcionarios.length;
	}
	
	public int numClientes() {
		return clientes.length;
	}
	
	
	// Métodos de mostra
	
	public void mostraFuncionarios() {
		for(int i = 0; i < funcionarios.length; i ++) {
			System.out.println(funcionarios[i].imprimeRelatorio());
		}
		
	}
	
	public void mostraClientes() {
		for(int i = 0; i < clientes.length; i ++) {
			System.out.println(clientes[i].imprimeRelatorio());
		}
	}
	
	public void mostraPresidente() {
		System.out.println(presidente.imprimeRelatorio());
	}

}
