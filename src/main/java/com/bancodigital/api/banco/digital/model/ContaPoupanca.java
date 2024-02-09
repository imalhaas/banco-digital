package com.bancodigital.api.banco.digital.model;

public class ContaPoupanca extends Conta{

    private double taxaRendimento;

    public ContaPoupanca(Cliente cliente, double taxaRendimento){
        super(cliente);
        this.taxaRendimento = taxaRendimento;
    }

    public Double acrescentarRendimento() {
        return getSaldo() * (1 + taxaRendimento);
    }

    public void transferenciaViaPix(Conta destino, double valor){
        double valorTransferencia = valor;
        super.transferenciaPix(destino, valorTransferencia);
    }

}
