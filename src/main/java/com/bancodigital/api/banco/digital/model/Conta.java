package com.bancodigital.api.banco.digital.model;

public class Conta {
    public Conta(Cliente cliente){
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    private String tipo;
    private double saldo;

    private double transferenciaPix;

    private Cliente cliente;

    public void transferenciaPix(Conta contaDestino, double valor){

    }

    public void exibirSaldo(double saldo){
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTransferenciaPix() {
        return transferenciaPix;
    }

    public void setTransferenciaPix(double transferenciaPix) {
        this.transferenciaPix = transferenciaPix;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
