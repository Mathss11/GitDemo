package eu.GitDemo.GitDemo;

public class Contact {

    private String nom;
    private String prenom;
    private String numeroTelephone;
    private String adresseMail;

    public Contact() {
    }

    public Contact(String nom, String prenom, String numeroTelephone, String adresseMail) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroTelephone = numeroTelephone;
        this.adresseMail = adresseMail;
    }


    public String getAdresseMail() {
        return adresseMail;
    }

    public void setAdresseMail(String adresseMail) {
        this.adresseMail = adresseMail;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numeroTelephone='" + numeroTelephone + '\'' +
                ", adresseMail='" + adresseMail + '\'' +
                '}';
    }

    public String presentation() {
        String s = "Je suis " + this.prenom + " " + this.nom + ", " +
                "Vous pouvez me contacter au " + this.numeroTelephone + " ou  " +
                "via mon email " + this.adresseMail + ".";
        return s;
    }

}
