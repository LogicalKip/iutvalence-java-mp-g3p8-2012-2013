// FIXME déplacer dans un paquetage
/**
 * 
 * @author duplanm
 *
 *Définition abstraite d'une forme
 */
public abstract class Forme
{
	/**
	 * Couleur associée à la forme
	 */
	protected Couleur color;
	

	/**
	 * @param couleur
	 * Constructeur qui permet de choisir la couleur de la forme
	 */
	public Forme(Couleur couleur)
	{
		this.color = couleur;
	}
	/**
	 * Constructeur de base, met la forme en blanc
	 */
	public Forme()
	{
		this.color = Couleur.BLANC;
	}
	
	/**
	 * Fait descendre la forme, d'un bloc, si possible
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
