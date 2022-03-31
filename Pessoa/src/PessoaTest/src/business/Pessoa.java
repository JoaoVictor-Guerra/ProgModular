package business;

public class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	private String cep;
	private String cidade;
	private String uf;
	
	public Pessoa() {
		setNome("Shulambs");
		setEndereco("Avenida Silva Lobo 283");
		setTelefone("123456789");
		setCep("12345-123");
		setCidade("Belo Horizonte");
		setUf("MG");
	}
	
	public Pessoa(String nome, String endereco, String telefone, String cep, String cidade, String uf) {
		setNome(nome);
		setEndereco(endereco);
		setTelefone(telefone);
		setCep(cep);
		setCidade(cidade);
		setUf(uf);	
	}

	// Getters

	public String getNome(){
		return this.nome;
	}
	
	public String getEndereco(){
		return this.endereco;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public String getCep() {
		return this.cep;
	}

	public String getCidade(){
		return this.cidade;
	}
	
	public String getUf() {
		return this.uf;
	}

	// Setters
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setCep(String cep) {
		if(cep.length() == 9) {
			this.cep = cep;
		}
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public void setUf(String uf) {
		if(uf.length() == 2) {
			this.uf = uf.toUpperCase(); 
			
		}
	}
	
	// Métodos gerais
	
	public String imprimeRelatorio() {
		return "Nome: " + getNome() + " -" + " Endereco: " + getEndereco() + " -" + " Telefone: " + getTelefone() +
			    " -" + " Cep: " + getCep() + " -" + " Cidade: " + getCidade() + " -" + " Uf: " + getUf();
	}

}