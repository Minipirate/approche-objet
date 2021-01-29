/**
 * 
 */
package essais;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

/**
 * @author Ness'ti
 *
 */
public class TestOperation {

	public static void main(String[] args) {

		int montantGlobal = 0;

		Operation[] tabOperation = new Operation[4];

		tabOperation[0] = new Credit("29/10/2021", 200);
		tabOperation[1] = new Credit("12/02/2021", 130);
		tabOperation[2] = new Debit("12/02/2021", 50);
		tabOperation[3] = new Debit("12/02/2021", 20);

		for (int i = 0; i < tabOperation.length; i++) {
			System.out.println("Un " + tabOperation[i].getClass().getSimpleName() + " a été effectué en date du : "
					+ tabOperation[i].getDateOperation() + " et est d'un montant de : "
					+ tabOperation[i].getMontantOperation() + " €");

			if (tabOperation[i].afficherType().equals("Credit")) {
				montantGlobal += tabOperation[i].getMontantOperation();
			} else {
				montantGlobal -= tabOperation[i].getMontantOperation();
			}
		}
		System.out.println(" ");
		System.out.println("Montant Global : " + montantGlobal + " €");
	}
}
