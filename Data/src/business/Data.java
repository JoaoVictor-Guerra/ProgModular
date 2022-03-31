package business;

public class Data {
    private int ano;
    private int dias;
    private int meses;
    // CONSTANTES
    private static final int MAX_MESES = 12;

    
    // Getters
    
    public int getAno() {
        return ano;
    }

    public int getDias() {
        return dias;
    }

    public int getMeses() {
        return meses;
    }
    
    // Setters
    
    public void setAno(int ano) {
    	this.ano = ano;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
    
    public void setMeses(int meses) {
        this.meses = meses;
    }

    /*
     * Construtores
     */
    
    public Data() {
    	setAno(2022);
    	setMeses(3);
    	setDias(20);
    }
    
    public Data(int ano, int mes, int dia) {
    	setAno(ano);
    	setMeses(mes);
    	setDias(dia);
    }

    /*
     * Verifica se o ano em questão é bisexto
     */

    public boolean eAnoBisexto() {
    	boolean resp;
        if (getAno() % 4 == 0 && getAno() % 100 != 0) {
            resp = true;
        } else if (getAno() % 4 == 0 && getAno() % 100 == 0 && getAno() % 400 == 0) {
            resp = true;
        } else {
            resp = false;
        }
        
        return resp;
    }

    /*
     * Adiciona dias a�data atual
     */

    public void adicionaDias(int dias) {
    	int totalDias = getDias() + dias;

        // Para caso seja um mês com 30 dias

        if (diasNoMes() == 30) {
            if (totalDias <= 30) {
                setDias(totalDias);
            } else {
            	setDias(totalDias - 30);
            	setMeses(getMeses() + 1);
            }
        } 

        // Para caso seja um mês com 31 dias
        
        else if (diasNoMes() == 31) {
            if (totalDias <= 31) {
            	setDias(totalDias);
            } else {
                if (getMeses() != MAX_MESES) {
                	setDias(totalDias - 31);
                	setMeses(getMeses() + 1);
                } 
                else {
                    setDias(totalDias - 31);
                    setMeses(1);
                    setAno(getAno() + 1);
                }
            }
        } 

        // Para caso seja fevereiro
        else {
            if (!eAnoBisexto()) {
                if (totalDias <= 29) {
                	setDias(totalDias);
                } else {
                	setDias(totalDias - 29);
                	setMeses(getMeses() + 1);
                }
            } else {
                if (totalDias <= 28) {
                	setDias(totalDias);
                } else {
                	setMeses(getMeses() + 1);
                }
            }
        }
    }
    
    /*
     * Avan�a um dia � data
     */
    
    public void proximoDia() {
    	adicionaDias(1);
    }

    /*
    * Mostra quantos dias dado mês tem
    */

    public int diasNoMes(){
        int numDias = 0;
        if (getMeses() == 4 || getMeses() == 6 || getMeses() == 9 || getMeses() == 11){
            numDias = 30;
        }
        else if(getMeses() == 1 || getMeses() == 3 || getMeses() == 5 || getMeses() == 7 || getMeses() == 8 || getMeses() == 10 || getMeses() == 12){
            numDias = 31;
        }
        else{
            if (eAnoBisexto()){
                numDias = 28;
            } else {
                numDias = 29;
            }
        }

        return numDias;
    }
    
    // Mostra o dia da semana atual da data

    public String diaDaSemana(){
    	
    	int diaSemana = encontraDia();
    	String resp = "";
    	
    	switch (diaSemana) {
    	  case 1:
    	    resp = "Segunda-feira";
    	    break;
    	  case 2:
    	    resp = "Terça-feira";
    	    break;
    	  case 3:
    	    resp = "Quarta-feira";
    	    break;
    	  case 4:
    	    resp = "Quinta-feira";
    	    break;
    	  case 5:
    	    resp = "Sexta-feira";
    	    break;
    	  case 6:
    	    resp = "Sábado";
    	    break;
    	  case 7:
    	    resp = "Domingo";
    	    break;
    	}
    	
        return resp;
    }
    
    // Implementa o algoritmo de Zeller para encontrar o dia específico da data
    
    public int encontraDia() {
    	int primeirosDigitosAno = getAno() / 100;
    	int ultimosDigitosAno = getAno() % 100;
    	int diaSemana = (((13 *(getMeses() + 1))/5) + (primeirosDigitosAno/4) + (ultimosDigitosAno/4) + getDias() + ultimosDigitosAno - 2 * primeirosDigitosAno);
    	
    	return diaSemana;
    }

 
    /*
     * Imprime a data atual na tela
     */

    public String porExtenso() {
        return (getDias() + "/" + getMeses() + "/" + getAno());
    }

}
