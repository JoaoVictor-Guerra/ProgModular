package business;

public class PessoaFisica extends Pessoa {
	private String cpf;
	
	public PessoaFisica(){
		super();
		setCpf("123.456.789-00");
	}
	
	public PessoaFisica(String nome, String endereco, String telefone, String cep, String cidade, String uf, String cpf) {
		super(nome, endereco, telefone, cep, cidade, uf);
		setCpf(cpf);
		
	}
	
	// Getters e Setters
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
	// Métodos gerais
	
	@Override
	public String imprimeRelatorio() {
		return "Nome: " + getNome() + " -" + " Endereco: " + getEndereco() + " -" + " Telefone: " + getTelefone() +
			    " -" + " Cep: " + getCep() + " -" + " Cidade: " + getCidade() + " -" + " Uf: " + getUf() + " -" + " Cpf: " + getCpf();
	}

}
