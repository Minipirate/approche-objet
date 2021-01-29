/**
 * 
 */
package fr.diginamic.banque.entites;

/**
 * @author Ness'ti
 *
 */
public class Debit extends Operation {

	public Debit(String dateOperation, int montantOperation) {
		super(dateOperation, montantOperation);
	}

	@Override
	public String afficherType() {
		return "Debit";
	}
}
