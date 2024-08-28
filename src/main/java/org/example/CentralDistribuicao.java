package org.example;

public interface CentralDistribuicao {

    String receberAgendarCorrida(String mensagem);
    String receberReclamacaoCorrida(String mensagem);
    String receberCancelarCorrida(String mensagem);

}
