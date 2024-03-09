package exercise2;

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        // Create a new ArrayList
        List<CompteBancaire> accounts = new ArrayList<>();

        // Add accounts
        accounts.add(new CompteCourant(1, 1000, "John Doe", 500));
        accounts.add(new CompteEpargne(2, 2000, "Jane Doe", 0.05));
        accounts.add(new CompteCourant(3, 3000, "John Smith", 1000));
        accounts.add(null);
        // Remove accounts
        accounts.remove(0);
        // Perform operations on accounts
        try {
            accounts.get(0).deposer(1000);
            System.out.println(accounts.get(0));

            accounts.get(0).retirer(5000); //throws FondsInsuffisantsException
            System.out.println(accounts.get(0));

        } catch (FondsInsuffisantsException e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }
        // Transfer money from one account to another
        try {
            accounts.get(1).transferer(1000, accounts.get(2)); //throws CompteInexistantException
            System.out.println(accounts.get(0));
            System.out.println(accounts.get(1));
        } catch (FondsInsuffisantsException | CompteInexistantException e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}