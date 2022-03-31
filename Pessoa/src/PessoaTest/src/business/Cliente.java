package business;

public class Cliente extends Pessoa{
	private static final double LIMITE_CREDITO = 500.0;
	private Double credito;
	
	public Cliente(){
		super();
		setCredito(0.0);
	}
	
	public Cliente(String nome, String endereco, String telefone, String cep, String cidade, String uf, Double salario, String cargo, Double credito) {
		super(nome, endereco, telefone, cep, cidade, uf);
		setCredito(credito);
	}
	
	// Getters e Setters
	
	public Double getCredito() {
		return this.credito;
	}
	
	public void setCredito(Double credito) {
		if(credito >= 0) {
			this.credito = credito;
		}
	}
	
	// Métodos gerais 
	
	public void addCredito(double creditoAdicionar) {
		setCredito(getCredito() + creditoAdicionar);
	}
	
	@Override
	public String imprimeRelatorio() {
		return "Nome: " + getNome() + " -" + " Endereco: " + getEndereco() + " -" + " Telefone: " + getTelefone() +
			    " -" + " Cep: " + getCep() + " -" + " Cidade: " + getCidade() + " -" + " Uf: " + getUf() + " -" + 
				" Credito: " + getCredito();
		
	}


}

