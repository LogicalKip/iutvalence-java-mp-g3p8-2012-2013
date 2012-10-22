package fr.iutvalence.java.projets.tetris;
// FIXME (FIXED) déplacer dans un paquetage

// FIXME (FIXED) détailler le commentaire (expliquer en quoi F_Cube est une forme particulière)
/**
 * Définit les différents mouvements possibles avec un cube, et comment ils interviennent dans
 * la zone de jeu.  Un Cube peut être représenté comme suit :
 *							##	
 * 							##
 * @author duplanm
 * 
 */
// FIXME (FIXED) respecter les conventions d'écriture
public class Cube extends Forme
{
	private final static Position[][] REPRESENTATIONS = new Position[][]
			{
				{new Position(0,0), new Position (1,0), new Position(0,1), new Position(1,1)}
			};
	/**
	 * Constructeur basé sur la classe supérieure
	 */
	public Cube(Position origine)
	{
		super(origine, Couleur.JAUNE, REPRESENTATIONS);
	}
	
}
