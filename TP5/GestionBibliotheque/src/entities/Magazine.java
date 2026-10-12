
package entities;

public class Magazine extends Document {
    private int numero;

    public Magazine(String titre, String auteur, int numero) {
        super(titre, auteur);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Magazine [" + super.toString()
            + ", Numero magazine : " + numero + "]";
    }
}
