/**
 * @author duplanm
 * Définit les différents mouvements possibles avec un cube, et comment ils interviennent dans
 * la zone de jeu
 */
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
	void tourner()	{	}

	void translationGauche()
	{
		
	}

	void translationDroite()
	{
		
	}
}
