package com.bancodigital.api.banco.digital.model;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente, double saldo) {
        super(cliente);
        super.getSaldo();
    }

    private double taxaManutencao;

    public double descontarTaxa(){
        return getSaldo() - taxaManutencao;
    }

    public double transferenciaViaPix(Conta destino, double valor) {
        double valorTransferencia = valor + taxaManutencao;
        super.transferenciaPix(destino, valorTransferencia);
        return valorTransferencia;
    }

}
