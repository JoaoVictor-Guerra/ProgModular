package business;

public class PessoaJuridica extends Pessoa{
	private String cnpj;
	
	public PessoaJuridica(){
		super();
		setCnpj("213-5");
	}
	
	public PessoaJuridica(String nome, String endereco, String telefone, String cep, String cidade, String uf, String cnpj) {
		super(nome, endereco, telefone, cep, cidade, uf);
		setCnpj(cnpj);
		
	}
	
	// Getters e Setters
	
	public String getCnpj() {
		return this.cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	// Métodos gerais
	
	@Override
	public String imprimeRelatorio() {
		return "Nome: " + getNome() + " -" + " Endereco: " + getEndereco() + " -" + " Telefone: " + getTelefone() +
			    " -" + " Cep: " + getCep() + " -" + " Cidade: " + getCidade() + " -" + " Uf: " + getUf() + " -" + " Cnpj: " + getCnpj();
	}

}
