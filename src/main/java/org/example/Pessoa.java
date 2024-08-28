package org.example;

public abstract class Pessoa {


    public String agendarCorrida(String mensagem) {
        return CallCenter.getInstancia().receberAgendaCorrida(mensagem);
    }

    public String reclamarCorrida(String mensagem) {
        return CallCenter.getInstancia().receberReclamacaoCorrida(mensagem);
    }

    public String cancelarCorrida(String mensagem) {
        return CallCenter.getInstancia().receberCancelarCorrida(mensagem);
    }

}
