package src.main.java;

public class Pagamento {

    private String status;

    public String getStatus() {
        return status;
    }

    public void pagarComCartaoCredito(float valor) {
        ProcessadorPagamento processador = new ProcessadorPagamento(valor);
        this.status = processador.processar(new PagamentoCartaoCredito());
    }

    public void pagarComCartaoDebito(float valor) {
        ProcessadorPagamento processador = new ProcessadorPagamento(valor);
        this.status = processador.processar(new PagamentoCartaoDebito());
    }

    public void pagarComBoleto(float valor) {
        ProcessadorPagamento processador = new ProcessadorPagamento(valor);
        this.status = processador.processar(new PagamentoBoleto());
    }

    public void pagarComPix(float valor) {
        ProcessadorPagamento processador = new ProcessadorPagamento(valor);
        this.status = processador.processar(new PagamentoPix());
    }

    public void pagarComDeposito(float valor) {
        ProcessadorPagamento processador = new ProcessadorPagamento(valor);
        this.status = processador.processar(new PagamentoDeposito());
    }

}