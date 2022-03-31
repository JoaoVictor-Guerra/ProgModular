import javax.print.attribute.standard.PrinterMakeAndModel;

public class Alunos {
    // CONSTANTES
    private static final int MAX_PONTOS = 100;
    private static final int MAX_PONTOSPROVA = 25;
    private static final int MIN_FREQUENCIA = 75;
    // ATRIBUTOS
    private String nome;
    private Turmas turma;
    private boolean isAprovado;
    private boolean isMatriculado = false;
    private int frequencia;
    // NOTAS DAS PROVAS
    private int notaAluno[];
    private int pontosTotais;

    // Construtor

    public Alunos(String nome, Turmas turma){
        setNome(nome);
        turma.addAluno(this);
        this.turma = turma;
        this.isMatriculado = true;
    }

    // Getters 

    public String getNome(){
        return this.nome;
    }

    public int getFrequencia() {
        return this.frequencia;
    }

    public int getPontosTotais() {
        for(int i = 0; i < notaAluno.length; i++){
            this.pontosTotais += notaAluno[i];
        }
        return this.pontosTotais;
    }

    public boolean isAprovado() {
        return this.isAprovado;
    }

    public boolean isMatriculado(){
        return this.isMatriculado;
    }

    public Turmas getTurmas(){
        return this.turma;
    }

    // Setters

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    public void setPontos(int pontos) {
        this.pontosTotais = pontos;
    }

    public void setAprovado(boolean isAprovado) {
        this.isAprovado = isAprovado;
    }

    // Mostra se o aluno foi ou não aprovado

    public void defineAprovado(){
        if(getFrequencia() >= MIN_FREQUENCIA && getPontosTotais() >= (MAX_PONTOS * 0.6)){
            setAprovado(true);
        }
        else {
            setAprovado(false);
        }

    }

    // Define uma nota da prova para o aluno

    public void defineNota(int numProva, int nota){
        if(numProva > 0 && numProva <= 4 && nota >= 0 && nota <= MAX_PONTOSPROVA){
            notaAluno[numProva] = nota;
        }
        
    }

    
}
