package business;

public class PessoaJuridica extends Pessoa {
	
	public PessoaJuridica(){
		super();
	}
	
	public PessoaJuridica(String nome, String endereco, String telefone, String cep, String cidade, String uf) {
		super(nome, endereco, telefone, cep, cidade, uf);
		
	}

}
