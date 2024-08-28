package org.example;

public class CallCenter {

    private static CallCenter instancia = new CallCenter();

    private CallCenter() {}

    public static CallCenter getInstancia() {
        return instancia;
    }

    public String receberAgendaCorrida(String mensagem) {
        return "A CooperTáxi agradece seu contato e informamos.\n"+
                ">>" + Taxista.getInstancia().receberAgendamentoCorrida(mensagem);
    }

    public String receberReclamacaoCorrida(String mensagem) {
        return "A CooperTáxi agradece seu contato e informamos.\n"+
                ">>" + Taxista.getInstancia().receberReclamacaoCorrida(mensagem);
    }

    public String receberCancelarCorrida(String mensagem) {
        return "A CooperTáxi agradece seu contato e informamos.\n"+
                ">>" + Taxista.getInstancia().receberCancelamentoCorrida(mensagem);
    }
}
