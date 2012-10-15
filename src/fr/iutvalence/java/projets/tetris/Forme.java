// FIXME déplacer dans un paquetage

// FIXME détailler le commentaire (ce qui caractérise une forme)
/**
 * 
 * Définition abstraite d'une forme
 * @author duplanm

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
	// FIXME visibilité ?
	abstract void descendre();
	
	/**
	 * Tourne la forme vers la droite, si possible (dépend de la forme en question).
	 */
	// FIXME visibilité ?
	abstract void tourner();
	
	/**
	 * Translation de la forme vers la gauche, si possible
	 */
	// FIXME visibilité ?
	abstract void translationGauche();
	
	/**
	 * Translation de la forme vers la droite, si possible
	 */
	// FIXME visibilité ?
	abstract void  translationDroite();
}
