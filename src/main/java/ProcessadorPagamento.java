package src.main.java;

public class ProcessadorPagamento {

    private float valor;

    public ProcessadorPagamento(float valor) {
        this.valor = valor;
    }

    public String processar(MetodoPagamento metodo) {
        return metodo.pagar(valor);
    }
}

