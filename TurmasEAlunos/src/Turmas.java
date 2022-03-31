import java.util.*;

public class Turmas{
    // CONSTANTES
    private static final int MAX_ALUNOS = 20;
    private static final int MAX_SEMANAS = 20;
    // ATRIBUTOS
    private int nivelTurma; 
    private int diaSemana;
    private int turno;
    private Alunos alunos[];
    private String codigoTurma;

    // Construtor

    public Turmas(int nivelTurma, int diaSemana, int turno){
        setNivelTurma(nivelTurma);
        setDiaSemana(diaSemana);
        setTurno(turno);
        geraCodigoTurma();
    }
    
    // Getters

    public int getNivelTurma() {
        return this.nivelTurma;
    }

    public int getDiaSemana(){
        return this.diaSemana;
    }

    public int getTurno(){
        return this.turno;
    }

    public String getCodigoTurma(){
        return this.codigoTurma;
    }

    // Setters

    public void setNivelTurma(int nivelTurma) {
        if(nivelTurma > 0 && nivelTurma <= 9){
            this.nivelTurma = nivelTurma;
        }
    }

    public void setDiaSemana(int diaSemana){
        if(diaSemana > 0 && diaSemana <= 7){
            this.diaSemana = diaSemana;
        }
    }

    public void setTurno(int turno){
        if(turno >= 1 && turno <= 3){
            this.turno = turno;
        }
    }

    // Gera o código da turma

    public void geraCodigoTurma(){
        String nivel = Integer.toString(getNivelTurma());
        String diaSemana = Integer.toString(getDiaSemana());
        String turno = Integer.toString(getTurno());
        this.codigoTurma = nivel + diaSemana + turno;
    }

    // Adiciona aluno na turma

    public void addAluno(Alunos aluno){
        if(aluno.isMatriculado() == false){

            if(alunos.length == 0){
                alunos[0] = aluno;
            }
            else{
                if(alunos.length < MAX_ALUNOS){
                    alunos[alunos.length + 1] = aluno;
                }
            }
        }
    }

    // Informações para os gestores

    public float mediaFrequencia(){
        float mediaFreq = 0;
        for(int i = 0; i < alunos.length; i++){
            mediaFreq += alunos[i].getFrequencia();
        }
        return mediaFreq/alunos.length;
    }

    public float mediaNota(){
        float mediaNota = 0;
        for(int i = 0; i < alunos.length; i++){
            mediaNota += alunos[i].getPontosTotais();
        }
        return mediaNota/alunos.length;
    }

    public void relatorio(){
        for(int i = 0; i < alunos.length; i ++){
            System.out.println("Nome: " + alunos[i].getNome() + "\n"
             + "Nota : " + alunos[i].getPontosTotais() + "\n"
             + "Aprovado: " + alunos[i].isAprovado());
        }
    }

    public Alunos alunoMelhorDesempenho(){
        Alunos melhorAluno = null;
        
        for(int i = 0; i < alunos.length; i ++){
                if(i == 0){
                    melhorAluno = alunos[i];
                }
                else {
                    if(alunos[i].getPontosTotais() > melhorAluno.getPontosTotais() && alunos[i].getFrequencia() >= 75) {
                        melhorAluno = alunos[i];           
                    }
                    else if(alunos[i].getPontosTotais() == melhorAluno.getPontosTotais()){
                        melhorAluno = desempataMelhorAluno(melhorAluno, alunos[i]);
                    }
            }
        }

        return melhorAluno;
    }

    public Alunos desempataMelhorAluno(Alunos melhorAluno, Alunos alunos){
        Alunos criterioDesempate = null;

        if(melhorAluno.getFrequencia() >= alunos.getFrequencia()){
            criterioDesempate = melhorAluno;
        } else {
            criterioDesempate = alunos;
        }
        return criterioDesempate;
    }

}




