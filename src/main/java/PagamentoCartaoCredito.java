package src.main.java;

public class PagamentoCartaoCredito implements MetodoPagamento {

    @Override
    public String pagar(float valor) {
        return "Pagamento de " + valor + " realizado com Cartão de Crédito";
    }
}

