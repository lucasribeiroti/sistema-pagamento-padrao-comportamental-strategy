package src.main.java;

public class PagamentoCartaoDebito implements MetodoPagamento {

    @Override
    public String pagar(float valor) {
        return "Pagamento de " + valor + " realizado com Cartão de Débito";
    }
}

