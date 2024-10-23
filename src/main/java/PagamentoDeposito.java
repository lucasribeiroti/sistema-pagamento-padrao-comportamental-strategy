package src.main.java;

public class PagamentoDeposito implements MetodoPagamento {

    @Override
    public String pagar(float valor) {
        return "Pagamento de " + valor + " realizado via Depósito";
    }
}

