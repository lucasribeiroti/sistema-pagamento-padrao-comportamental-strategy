package src.main.java;

public class PagamentoPix implements MetodoPagamento {

    @Override
    public String pagar(float valor) {
        return "Pagamento de " + valor + " realizado via Pix";
    }
}

