package fr.iutvalence.java.projets.tetris;

/**
 * Définit les différents mouvements possibles avec une barre, et comment ils interviennent dans
 * la zone de jeu.  Une Barre peut être représenté comme suit :  
 *							####
 * @author duplanm
 * 
 */
public class Barre extends Forme
{
	/**
	 * Définit les différentes orientations ainsi que la position des blocs dans la forme.
	 */
	private final static Position[][] REPRESENTATIONS = new Position[][]
			{
				{new Position(0,0), new Position (1,0), new Position(2,0), new Position(3,0)},
				{new Position(0,0), new Position (0,1), new Position(0,2), new Position(0,3)}
			};
	/**
	 * Constructeur basé sur la classe supérieure
	 * @param origine représentation du coin supérieur gauche
	 */
	public Barre(Position origine)
	{
		super(origine, Couleur.ROUGE, REPRESENTATIONS);
	}
	
}
