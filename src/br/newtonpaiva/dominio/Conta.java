package br.newtonpaiva.dominio;

public class Conta {
    private Integer numero;

    private Double saldo;

    public Double sacar(Double valor) {
        return 0.0;
    }

    public Double depositar(Double valor) {
        if (valor <= 0 || valor == null)
            throw new IllegalArgumentException("O valor foi menor ou igual a zero.");
        saldo += valor;
        return saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

}
