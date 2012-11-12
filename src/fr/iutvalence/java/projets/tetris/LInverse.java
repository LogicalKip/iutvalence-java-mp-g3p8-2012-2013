package fr.iutvalence.java.projets.tetris;

/**
 * @author duplanm
 * Définit les différents mouvements possibles avec un LInverse, et comment ils interviennent dans
 * la zone de jeu. Un LInverse peut être représenté comme suit : 
 *							#	 
 * 							#
 * 						   ##
 */
public class LInverse extends Forme
{
	/**
	 * Définit les différentes orientations ainsi que la position des blocs dans la forme.
	 */
	private final static Position[][] REPRESENTATIONS = new Position[][]
			{
				{new Position(0,0), new Position (1,0), new Position(1,-1), new Position(1,-2)},
				{new Position(0,0), new Position (0,1), new Position(1,1), new Position(2,1)},
				{new Position(0,0), new Position (1,0), new Position(0,1), new Position(0,2)},
				{new Position(0,0), new Position (1,0), new Position(2,0), new Position(2,1)}
			};
	/**
	 * Constructeur basé sur la classe supérieure
	 * @param origine représentation du coin supérieur gauche
	 */
	public LInverse(Position origine)
	{
		super(origine, Couleur.BLEU, REPRESENTATIONS);
	}
	
}
