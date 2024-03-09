package exercise2;


public class CompteCourant extends CompteBancaire {

    private double decouvert;

    public CompteCourant(long numCompte, double solde, String nomTitulaire, double decouvert) {
        super(numCompte, solde, nomTitulaire);
        this.decouvert = decouvert;
    }

    public double getDecouvert() {
        return this.decouvert;
    }

    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }

    @Override
    public void retirer(double montant) throws FondsInsuffisantsException {
        if (montant > this.getSolde() + this.decouvert) throw new FondsInsuffisantsException();
        this.setSolde(this.getSolde() - montant);
    }
}