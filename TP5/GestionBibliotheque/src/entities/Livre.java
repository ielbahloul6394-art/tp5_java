
package entities;

public class Livre extends Document {
    private int nombrePages;

    public Livre(String titre, String auteur, int nombrePages) {
        super(titre, auteur);
        this.nombrePages = nombrePages;
    }

    public int getNombrePages() {
        return nombrePages;
    }

    @Override
    public String toString() {
        return "Livre [" + super.toString()
            + ", Pages : " + nombrePages + "]";
    }
}
