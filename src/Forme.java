// FIXME déplacer dans un paquetage

// FIXME écrire un commentaire
public abstract class Forme
{
	// FIXME écrire un commentaire
	// TODO réfléchir à une gestion sans couleur...
	protected int couleur;
	
	// FIXME constructeurs ?
	
	/**
	 * Fait descendre la forme d'un bloc si possible
	 */
	abstract void descendre();
	
	/**
	 * Tourne la forme vers la droite, si possible (dépend de la forme en question).
	 */
	abstract void tourner();
	
	
	// FIXME déplacer ?
}
