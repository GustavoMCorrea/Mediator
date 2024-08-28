package org.example;

public class Taxista {

    private static Taxista instancia = new Taxista();

    private Taxista() {}

    public static Taxista getInstancia() {
        return instancia;
    }

    public String receberReclamacaoCorrida(String mensagem) {
        return "Pedimos desculpas e vamos procurar melhorar o serviço da reclamação: " + mensagem;
    }

    public String receberAgendamentoCorrida(String mensagem) {
        return "O Taxista está seguindo para o seu endereço:";
    }

    public String receberCancelamentoCorrida(String mensagem) {
        return "Sua corrida : " + mensagem +" foi cancelada";
    }

}
