package exercise2;

public class CompteBancaire {

    private long numCompte;
    private double solde;
    private String nomTitulaire;

    public CompteBancaire(long numCompte, double solde, String nomTitulaire) {
        this.numCompte = numCompte;
        this.solde = solde;
        this.nomTitulaire = nomTitulaire;
    }

    public void deposer(double montant) {
        this.solde += montant;
    }

    public void retirer(double montant) throws FondsInsuffisantsException {
        if (montant > this.solde) throw new FondsInsuffisantsException();
        this.solde -= montant;
    }

    public void transferer(double montant, CompteBancaire compte) throws FondsInsuffisantsException, CompteInexistantException {
        if (montant > this.solde) throw new FondsInsuffisantsException();
        if (compte == null) throw new CompteInexistantException();
        this.solde -= montant;
        compte.deposer(montant);
    }


    public double getSolde() {
        return this.solde;
    }

    public long getNumCompte() {
        return this.numCompte;
    }

    public String getNomTitulaire() {
        return this.nomTitulaire;
    }

    public void setNumCompte(long numCompte) {
        this.numCompte = numCompte;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setNomTitulaire(String nomTitulaire) {
        this.nomTitulaire = nomTitulaire;
    }

    @Override
    public String toString() {
        return "CompteBancaire [numCompte=" + numCompte + ", solde=" + solde + ", nomTitulaire=" + nomTitulaire + "]";
    }

}
