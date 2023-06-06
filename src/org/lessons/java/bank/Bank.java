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
        boolean esci = false;

        do{
            System.out.println("Cosa vuoi fare?" + "\n1)Versare denaro " + "\n2)Prelevare denaro" + "\n3)Uscire" + "\nScrivi il numero corrispondente alla tua scelta");
            opzione = utente.nextLine();

            switch (opzione) {
                case "1":
                    // versamento
                    System.out.print("Versamento: ");
                    versamento = utente.nextDouble();
                    contoUtente.versaDeposito(versamento);
                    System.out.println("Il tuo saldo è " + contoUtente.saldoFormattato());
                    break;
                case "2":
                    // prelievo
                    System.out.print("Prelievo: ");
                    prelievo = utente.nextDouble();
                    contoUtente.faiPrelievo(prelievo);
                    System.out.println("Il tuo saldo è " + contoUtente.saldoFormattato());
                    break;
                case "3":
                    // esci;
                    System.out.println("Arrivederci!");
                    esci = true;
                    break;
                default:
                    System.out.println("Devi scegliere 1, 2 o 3");
                    break;
            }
        }while (!esci);
    }
}
