package fr.iutvalence.java.projets.tetris;

/**
 * Définit les différents mouvements possibles avec un cube, et comment ils interviennent dans
 * la zone de jeu.  Un Cube peut être représenté comme suit :  
 *							##	
 * 							##
 * @author duplanm
 * 
 */
public class Cube extends Forme
{
	/**
	 * Définit les différentes orientations ainsi que la position des blocs dans la forme.
	 */
	private final static Position[][] REPRESENTATIONS = new Position[][]
			{
				{new Position(0,0), new Position (1,0), new Position(0,1), new Position(1,1)}
			};
	/**
	 * Constructeur basé sur la classe supérieure
	 * @param origine représentation du coin supérieur gauche
	 */
	public Cube(Position origine)
	{
		super(origine, Couleur.JAUNE, REPRESENTATIONS);
	}
	
}
