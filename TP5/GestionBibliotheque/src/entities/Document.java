
package entities;

public class Document {
    private static int compteur = 0;
    private int numEnreg;
    private String titre;
    private String auteur;

    public Document(String titre, String auteur) {
        this.numEnreg = ++compteur;
        this.titre = titre;
        this.auteur = auteur;
    }

    public int getNumEnreg() {
        return numEnreg;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "Numero : " + numEnreg
            + ", Titre : " + titre
            + ", Auteur : " + auteur;
    }
}
