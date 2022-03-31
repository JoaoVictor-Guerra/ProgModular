package test;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import business.Microondas;

public class MicroondasTest {
	
	Microondas microondas;
	
	@BeforeEach
    void init(){
        microondas = new Microondas();
    }
	
    @Test
    @DisplayName ("Verifica se o microondas pode ser pausado enquanto ligado")
    void PausarEnquantoLigado(){
    	microondas.ligar();
    	microondas.pausar();
    	assertEquals(true, microondas.getIsPausado());
    }
    
    @Test
    @DisplayName ("Verifica se o microondas pode ser desligado enquanto ligado")
    void DesligarEnquantoLigado(){
    	microondas.ligar();
    	microondas.desligar();
    	assertEquals(false, microondas.getIsLigado());
    }
    
    @Test
    @DisplayName ("Verifica se o Micro Ondas pode ser ligado quando estiver aberto.")
    void IsligadoEnquantoFechado(){
    	microondas.abrirPorta();
    	microondas.ligar();
        assertEquals(false, microondas.getIsLigado());
    }
    
    @Test
    @DisplayName ("Verifica se a porta do Microondas pode ser aberta quando ele estiver desligado.")
    void AbrirPortaDesligado(){
    	microondas.desligar();
    	microondas.abrirPorta();
    	assertEquals(true, microondas.getIsAberto());
    }
    
    @Test
    @DisplayName ("Verifica se a porta do Microondas pode ser aberta quando ele estiver ligado.")
    void AbrirPortaLigado(){
    	microondas.ligar();
    	microondas.abrirPorta();
    	assertEquals(false, microondas.getIsAberto());
    }
     
    @Test
    @DisplayName ("Verifica se o temporizador é corretamente atualizado")
    void AtualizaTemporizador(){
    	microondas.ligar();
    	microondas.iniciaTemporizador(10);
    	for(int i = 0; i < 5; i++) {
    		microondas.passarTempoSegundo();
    	}
    	assertEquals(5, microondas.getTempoTemporizador());
    }
    
    @Test
    @DisplayName ("Verifica se o temporizador passa enquanto o microondas estiver pausado")
    void PassarTemporizadorPausado(){
    	microondas.ligar();
    	microondas.iniciaTemporizador(10);
    	microondas.pausar();
    	microondas.passarTempoSegundo();
    	assertEquals(10, microondas.getTempoTemporizador());
    }
    
    @Test
    @DisplayName ("Verifica se o temporizador é corretamente reiniciado")
    void ReiniciaTemporizador(){
    	microondas.ligar();
    	microondas.iniciaTemporizador(30);
    	for(int i = 0; i < 5; i++) {
    		microondas.passarTempoSegundo();
    	}
    	microondas.reiniciar();
    	assertEquals(30, microondas.getTempoTemporizador());
    }
    
    @Test
    @DisplayName ("Verifica se o temporizador é igual a 0 [Constante de desligamento] quando o microondas é desligado")
    void TemporizadorDesligarMicroondas(){
    	microondas.ligar();
    	microondas.iniciaTemporizador(50);
    	microondas.desligar();
        assertEquals(0, microondas.getTempoTemporizador());
    }
    
    @Test
    @DisplayName ("Verifica se, quando o processo acaba, o temporizador adquire valor -1 [Constante de encerramento]")
    void TemporizadorValorZero(){
    	microondas.ligar();
    	microondas.iniciaTemporizador(1);
    	microondas.passarTempoSegundo();
        assertEquals(-1, microondas.getTempoTemporizador());
    }
    
}
