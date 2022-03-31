package business;

public class Microondas {
	// ATRIBUTOS
	private boolean isPausado;
	private boolean isLigado;
	private boolean isAberto;
	// ATRIBUTOS-TEMPORIZADOR
	private int tempoOriginal;
	private int tempoTemporizador;
	// CONSTANTES
	private static final int PROCESSO_ENCERRADO = -1;
	private static final int PROCESSO_DESLIGADO = 0;
	
	
	public Microondas() {
		this.isAberto = false;
		setIsLigado(false);
	} 
	
	/**
     * Retorna o tempo atual (em segundos) no temporizador
     */
    public int getTempoTemporizador() {
        return this.tempoTemporizador;
    }
	
    /**
     * Retorna se o microondas est� aberto ou n�o
     */
    public boolean getIsAberto() {
        return this.isAberto;
    }
    
    /**
     * Retorna se o microondas est� ligado ou n�o
     */
    
    public boolean getIsLigado() {
    	return this.isLigado;
    }
    
    /**
     * Retorna se o microondas est� pausado ou n�o
     */
    public boolean getIsPausado() {
        return this.isPausado;
    }
    
    /**
     * Atualiza se o microondas est� ligado ou n�o
     */
    
    public void setIsLigado(boolean isLigado) {
    	this.isLigado = isLigado;
    }
     
    /**
     * Atualiza se o microondas est� pausado ou n�o
     */
    
    public void setIsPausado(boolean isPausado) {
    	this.isPausado = isPausado;
    }
    
    // Define o tempo do temporizador
    
    public void setTempoTemporizador(int tempo) {
       this.tempoTemporizador = tempo;
        	
    }
    
    // Salva o tempo original do temporizador 
    
    public void setTempoOriginal(int segundos) {
		this.tempoOriginal = segundos;	
	}   
    /**
     * Liga o microondas se a porta estiver fechada
     */

	public void ligar() {
		boolean podeAbrir;
		if(isAberto == true) {
			podeAbrir = false;
		} else {
			podeAbrir = true;
		}
		setIsLigado(podeAbrir);
	}

	/**
     * Pausa o microondas
     */
	
	public void pausar() {
		if(getIsLigado() == true) {
			setIsPausado(true);
		}
	}
	
    /**
     * Desliga o microondas
     */
	
	public void desligar() {
		setIsLigado(false);
		setTempoTemporizador(PROCESSO_DESLIGADO);

	}
	
    /**
     * Despausa o microondas
     */
	
	public void despausar() {
		setIsPausado(false);
	}

	    /**
     * Abre a porta do microondas
     */
	
	public void abrirPorta() {
		if(isLigado == false) {
			this.isAberto = true;
		}
	}
	
    /**
     * Fecha a porta do microondas
     */
	
	public void fecharPorta() {
		this.isAberto = false;
	}
	
    /**
     * Inicia o temporizador
     */
	
	public void iniciaTemporizador(int segundos) {
		if(segundos > 0 && getIsLigado() == true) {
			setTempoTemporizador(segundos);
			setTempoOriginal(segundos);
		}
	}

	/**
     * Passa o tempo do temporizador em 1 segundo
     */
	
	public void passarTempoSegundo() {
		if(getIsLigado() == true && isPausado == false && getTempoTemporizador() > 1) {
			setTempoTemporizador(getTempoTemporizador() - 1);
		} 
		else if(getIsLigado() == true && isPausado == false && getTempoTemporizador() == 1) {
			setTempoTemporizador(PROCESSO_ENCERRADO);
			mensagemPronto();
		}
		else {
			System.out.println("Erro ao passar o tempo!");
		}
	}
	
    /**
     * Reinicia o temporizador do microondas
     */
	
	public void reiniciar() {
		if(getIsLigado() == true && getTempoTemporizador() > 0) {
			setTempoTemporizador(tempoOriginal);
		}
	}
	
    /**
     * Imprime o tempo atual do temporizador
     */
	
	public void imprimeTempo() {
		String novoTempo = converteSegundos(getTempoTemporizador());
		System.out.println(novoTempo);
	}
	
    /**
     * Converte os segundos em minutos-segundos excedentes
     */
	
	public String converteSegundos(int segundos) {
		String tempo;
		if(segundos > 60) {
			int minutos = segundos/60;
			int segundosRestantes = ((segundos % 60)/60) * 60;
			tempo = minutos + "minutos e" + segundosRestantes + "segundo";
		} 
		else {
			tempo = Integer.toString(segundos) + "segundos";	
		}
		return tempo;
	}
	
    /**
     * Avisa ao usu�rio que o tempo chegou ao fim
     */
	
	public void mensagemPronto() {
		System.out.println("Plim... plim... plim...");	
	}
	
}
