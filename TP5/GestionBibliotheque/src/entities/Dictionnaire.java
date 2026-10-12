
package entities;

public class Dictionnaire extends Document {
    private String langue;

    public Dictionnaire(String titre, String auteur, String langue) {
        super(titre, auteur);
        this.langue = langue;
    }

    public String getLangue() {
        return langue;
    }

    @Override
    public String toString() {
        return "Dictionnaire [" + super.toString()
            + ", Langue : " + langue + "]";
    }
}
