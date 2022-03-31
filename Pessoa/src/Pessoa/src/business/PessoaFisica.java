package business;

public class PessoaFisica extends Pessoa{
	
	public PessoaFisica(){
		super();
	}
	
	public PessoaFisica(String nome, String endereco, String telefone, String cep, String cidade, String uf) {
		super(nome, endereco, telefone, cep, cidade, uf);
		
	}

}
