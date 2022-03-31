package business;

public class Funcionario extends PessoaFisica {
	private Double salario;
	private String cargo;
	// Constantes
	private static final Double MIN_SALARIO = 1000.00;
	
	public Funcionario(){
		super();
		setSalario(MIN_SALARIO);
		setCargo("Atendente");
	}
	
	public Funcionario(String nome, String endereco, String telefone, String cep, String cidade, String uf, String cpf, Double salario, String cargo) {
		super(nome, endereco, telefone, cep, cidade, uf, cpf);
		setSalario(salario);
		setCargo(cargo);
		
	}
	
	// Getters e Setters

	public Double getSalario() {
		return this.salario;
	}
	
	private String getCargo() {
		return this.cargo;
	}

	public void setSalario(double salario) {
		if(salario >= MIN_SALARIO) {
			this.salario = salario;
		}
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo; 
	}
	
	// Métodos gerais

	public String imprimeRelatorioSimplificado() {
		return "Nome: " + getNome() + " -" + " Cargo: " + getCargo() + " -" + " Salario: " + getSalario();
	}
	
	@Override
	public String imprimeRelatorio() {
		return "Nome: " + getNome() + " -" + " Endereco: " + getEndereco() + " -" + " Telefone: " + getTelefone() +
			    " -" + " Cep: " + getCep() + " -" + " Cidade: " + getCidade() + " -" + " Uf: " + getUf() + " -" + " Cpf: " + getCpf() + " -" + 
				" Cargo: " + getCargo() + " -" + " Salario: " + getSalario();
		
	}

}
