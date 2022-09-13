package bankmatic_project;

import java.util.Scanner;

public class proje {
    public static void main(String[] args) {
        /*
        bakiye ogrenme para yatirma ve cekme cikis islemlerinin yapildigi bir atm app olusturalim
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("  ****** Bienvenue ***** ");
        System.out.println("Demande de solde : 1\nretire de l'argent : 2\nverser : 3\nquitter : 4\n veuillez selectionner l'action que vous souhaitez effectuer : ");

        int traiter = scan.nextInt();
        int solde = 1000;

        switch (traiter) {
            case 1:
                System.out.println("votre solde : " + solde);
                break;
            case 2:
                System.out.println("Saisisez le montant que vouz souhaitez retirer.");
                int cSolde = scan.nextInt();
                if (cSolde > solde) {
                    System.out.println("inpossible");
                } else {
                    solde -= cSolde;
                    System.out.println("votre solde : " + solde);
                }
                break;
            case 3:
                System.out.println("entre le montant que vouz souhaitez deposer : ");
                int ySolde = scan.nextInt();
                solde += ySolde;
                System.out.println("votre solde : " + solde);
                break;
            case 4:
                System.out.println(" Merci A Bientot ");
                System.out.println("  ******  ");
                break;
            default:
                System.out.println("Entree invalide");
        }
    }
}
