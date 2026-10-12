
package bibliotheque;

import entities.Document;

public class Bibliotheque {
    private Document[] documents;
    private int nombreDocuments;

    public Bibliotheque(int capacite) {
        if (capacite < 0) {
            throw new IllegalArgumentException(
                "La capacite doit etre positive."
            );
        }

        documents = new Document[capacite];
        nombreDocuments = 0;
    }

    public void afficherDocuments() {
        if (nombreDocuments == 0) {
            System.out.println("La bibliotheque est vide.");
            return;
        }

        for (int i = 0; i < nombreDocuments; i++) {
            System.out.println(documents[i]);
        }
    }

    public boolean ajouter(Document doc) {
        if (doc == null || nombreDocuments == documents.length) {
            return false;
        }

        documents[nombreDocuments] = doc;
        nombreDocuments++;
        return true;
    }

    public boolean supprimer(Document doc) {
        if (doc == null) {
            return false;
        }

        for (int i = 0; i < nombreDocuments; i++) {
            if (documents[i] == doc) {
                for (int j = i; j < nombreDocuments - 1; j++) {
                    documents[j] = documents[j + 1];
                }

                documents[nombreDocuments - 1] = null;
                nombreDocuments--;
                return true;
            }
        }

        return false;
    }

    public Document document(int numEnrg) {
        for (int i = 0; i < nombreDocuments; i++) {
            if (documents[i].getNumEnreg() == numEnrg) {
                return documents[i];
            }
        }

        return null;
    }

    public void afficherAuteurs() {
        boolean trouve = false;

        for (int i = 0; i < nombreDocuments; i++) {
            String auteur = documents[i].getAuteur();

            if (auteur != null && !auteur.trim().isEmpty()) {
                System.out.println(auteur);
                trouve = true;
            }
        }

        if (!trouve) {
            System.out.println("Aucun auteur disponible.");
        }
    }
}
