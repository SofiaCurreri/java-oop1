package org.lessons.java.bank;

import java.text.DecimalFormat;
public class Conto {
    //ATTRIBUTI
    private int numConto;
    private String nomeProprietario;
    private double saldo;

    //COSTRUTTORE
    public Conto(int numConto, String nomeProprietario){
        this.numConto = numConto;
        this.nomeProprietario = nomeProprietario;
        this.saldo = 0;
    }

    //GETTER
    public int getNumConto() {
        return this.numConto;
    }

    public String getNomeProprietario() {
        return this.nomeProprietario;
    }

    public double getSaldo() {
        return this.saldo;
    }

    //SETTER
    public void setNomeProprietario(String nome){
        this.nomeProprietario = nome;
    }

    //METHODS
    public void versaDeposito(double deposito){
        this.saldo += deposito;
    }

    public void faiPrelievo(double prelievo){
        if(this.saldo >= prelievo) this.saldo -= prelievo;
        else System.out.println("Se prelevi così tanto il conto andrà in rosso! Non puoi procedere con questa operazione");
    }

    public String saldoFormattato(){
        DecimalFormat saldoFormattato = new DecimalFormat("0,00€");
        return saldoFormattato.format(this.saldo);
    }
}
