/**
 * 
 * @author duplanm
 *
 *Définition abstraite d'une forme
 */
public abstract class Forme
{
	// FIXME écrire un commentaire
	// TODO réfléchir à une gestion sans couleur...
	// FIXME Est-il possible de faire un genre de variable abstraite, telle que les classes héritant de Forme aient toujours un attribut couleur ?
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
	
	/**
	 * Translation de la forme vers la gauche, si possible
	 */
	abstract void translationGauche();
	
	/**
	 * Translation de la forme vers la droite, si possible
	 */
	abstract void  translationDroite();
}
