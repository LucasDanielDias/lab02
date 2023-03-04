package br.newtonpaiva.dominio;

import java.util.Objects;

public class Conta {
    private Integer numero;

    private Double saldo;

    public Conta(Integer numero){
        this(numero, 0.0);
    }
    public Conta(){
        this(null,null);
    }
    public  Conta(Integer numero, Double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return Objects.equals(numero, conta.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }
}
