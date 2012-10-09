// FIXME déplacer dans un paquetage

// FIXME détailler le commentaire (expliquer en quoi F_Cube est une forme particulière)
/**
 * Définit les différents mouvements possibles avec un cube, et comment ils interviennent dans
 * la zone de jeu
 * @author duplanm
 * 
 */
// FIXME respecter les conventions d'écriture
public class F_Cube extends Forme
{
	
	/**
	 * Constructeur basé sur la classe supérieure
	 */
	public F_Cube()
	{
		super(Couleur.JAUNE);
	}
	public void descendre()
	{
		
	}

	/**
	 * Le cube ne tourne pas - ou plutôt, il tourne mais on ne voit pas la différence en termes de gameplay
	 */
	// FIXME visibilité ?
	void tourner()	{	}

	// FIXME visibilité ?
	void translationGauche()
	{
		
	}

	// FIXME visibilité ?
	void translationDroite()
	{
		
	}
	
}
