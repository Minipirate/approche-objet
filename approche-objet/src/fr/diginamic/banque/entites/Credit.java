/**
 * 
 */
package fr.diginamic.banque.entites;

/**
 * @author Ness'ti
 *
 */
public class Credit extends Operation {

	public Credit(String dateOperation, int montantOperation) {
		super(dateOperation, montantOperation);
	}

	@Override
	public String afficherType() {
		return "Credit";
	}
}
