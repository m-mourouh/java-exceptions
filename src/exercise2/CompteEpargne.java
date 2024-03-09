package exercise2;

class CompteEpargne extends CompteBancaire {
    private double tauxInteret;

    public CompteEpargne(long numCompte, double solde, String nomTitulaire, double tauxInteret) {
        super(numCompte, solde, nomTitulaire);
        this.tauxInteret = tauxInteret;
    }

    public double getTauxInteret() {
        return this.tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    public void calculerInterets() {
        this.setSolde(this.getSolde() + this.getSolde() * this.tauxInteret);
    }
}