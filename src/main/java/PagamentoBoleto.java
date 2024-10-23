package src.main.java;

public class PagamentoBoleto implements MetodoPagamento {

    @Override
    public String pagar(float valor) {
        return "Boleto gerado para o valor de " + valor;
    }
}
