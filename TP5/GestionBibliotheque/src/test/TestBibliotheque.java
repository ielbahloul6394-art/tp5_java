
package test;

import java.util.Scanner;
import entities.*;
import bibliotheque.Bibliotheque;

public class TestBibliotheque {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Capacite de la bibliotheque : ");
        int n = sc.nextInt();
        sc.nextLine();

        if (n < 2) {
            System.out.println(
                "La capacite doit etre au moins 2."
            );
            sc.close();
            return;
        }

        Bibliotheque b = new Bibliotheque(n);

        b.ajouter(new Livre("Le Petit Prince",
            "Antoine de Saint-Exupery", 96));

        b.ajouter(new Dictionnaire(
            "Larousse", "Pierre Larousse", "Francais"));

        int choix;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Ajouter un livre");
            System.out.println("2. Afficher les documents");
            System.out.println("3. Supprimer un document");
            System.out.println("4. Rechercher un document");
            System.out.println("5. Afficher les auteurs");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");

            choix = sc.nextInt();
            sc.nextLine();

            switch (choix) {
                case 1:
                    System.out.print("Titre : ");
                    String titre = sc.nextLine();

                    System.out.print("Auteur : ");
                    String auteur = sc.nextLine();

                    System.out.print("Nombre de pages : ");
                    int pages = sc.nextInt();
                    sc.nextLine();

                    if (b.ajouter(
                        new Livre(titre, auteur, pages))) {
                        System.out.println("Livre ajoute.");
                    } else {
                        System.out.println(
                            "Echec : bibliotheque pleine.");
                    }
                    break;

                case 2:
                    b.afficherDocuments();
                    break;

                case 3:
                    System.out.print(
                        "Numero d'enregistrement : ");
                    int numSup = sc.nextInt();
                    sc.nextLine();

                    Document docSup = b.document(numSup);

                    if (b.supprimer(docSup)) {
                        System.out.println("Document supprime.");
                    } else {
                        System.out.println(
                            "Document introuvable.");
                    }
                    break;

                case 4:
                    System.out.print(
                        "Numero d'enregistrement : ");
                    int num = sc.nextInt();
                    sc.nextLine();

                    Document doc = b.document(num);

                    if (doc != null) {
                        System.out.println(doc);
                    } else {
                        System.out.println(
                            "Document introuvable.");
                    }
                    break;

                case 5:
                    b.afficherAuteurs();
                    break;

                case 0:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide.");
            }

        } while (choix != 0);

        sc.close();
    }
}

