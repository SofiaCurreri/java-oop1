package org.lessons.java.bank;

import java.util.Scanner;
public class Bank {
    public static void main(String[] args){
        String nome;
        String opzione;
        double versamento;
        double prelievo;
        int numConto;

        numConto = (int)(Math.random()* 1001);

        Scanner utente = new Scanner(System.in);
        System.out.println("Puoi fornirmi il tuo nome?");
        nome = utente.nextLine();

        Conto contoUtente = new Conto(numConto, nome);

        do{
            System.out.println("Cosa vuoi fare?" + "\na)Versare denaro " + "\nb)Prelevare denaro" + "\nc)Uscire" + "\nScrivi la lettera corrispondente alla tua scelta");
            opzione = utente.nextLine();

            if(opzione.equals("a")){
                System.out.println("Quanto vuoi versare?");
                versamento = utente.nextDouble();
                contoUtente.versaDeposito(versamento);
                System.out.println("Il tuo saldo ammonta a " + contoUtente.saldoFormattato());
            } else if (opzione.equals("b")){
                System.out.println("Quanto vuoi prelevare?");
                prelievo = utente.nextDouble();
                contoUtente.faiPrelievo(prelievo);
                System.out.println("Il tuo saldo ammonta a " + contoUtente.saldoFormattato());
            } else if (opzione.equals("c")){
                break;
            } else {
                System.out.println("Devi scegliere una delle tre opzioni");
            }
        }while (!(opzione.equals("c")));
    }
}
