/**
 * 
 */
package fr.diginamic.banque.entites;

/**
 * @author Ness'ti
 *
 */
public abstract class Operation {

	private String dateOperation;
	private int montantOperation;

	public Operation(String dateOperation, int montantOperation) {
		this.dateOperation = dateOperation;
		this.montantOperation = montantOperation;
	}

	public abstract String afficherType();

	public String getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
	}

	public int getMontantOperation() {
		return montantOperation;
	}

	public void setMontantOperation(int montantOperation) {
		this.montantOperation = montantOperation;
	}
}
