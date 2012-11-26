package fr.iutvalence.java.projets.tetris;

import java.util.*;

/**
 *  
 * Classe centrale de l'application : début du jeu 
 * TODO (différents selon des paramètrse choisis précédemment et fournis) 
 * affichage de la Map, des Formes, interaction avec le joueur 
 * @author duplanm
 */
public class Partie
{
	//TODO redéfinir l'affichage de la map en ascii (en incluant formeCourante, ce qui n'est pour 
	// l'instant pas le cas dans toString de Map
	/**
	 * Appel de la classe Map avant initialisation et lancement de la partie
	 */
	public Map map;
	
	/**
	 * Une forme, définie aléatoirement au cours du jeu
	 */
	private Forme formeCourante;
	
	/**
	 * Constructeur de la classe Partie
	 * Crée une map vide avant l'initialisation et le lancement de la partie.
	 */
	public Partie()
	{
		this.map = new Map();
	}
	
	/**
	 * Méthode principale de Partie. 
	 */
	public void start()
	{
		this.formeCourante = randForme(5, 5);
		this.map.poserForme(this.formeCourante);
		System.out.println(this.map.toString());
	}
	
	/**
	 * Renvoie une Forme aléatoire
	 * @param x abscisses
	 * @param y ordonnées
	 * @return renvoie la forme générée aléatoirement
	 */
	private Forme randForme(int x, int y)
	{
		Forme f;
		
		int rand = (int) (Math.random() * 6); // Bonne formule ?
		switch (rand)
		{
			case 0:
				f = new Barre(new Position(x,y));
				break;
			case 1:
				f = new Cube(new Position(x,y));
				break;
			case 2:
				f = new L(new Position(x,y));
				break;
			case 3:
				f = new LInverse(new Position(x,y));
				break;
			case 4:
				f = new S(new Position(x,y));
				break;
			case 5:
				f = new Z(new Position(x,y));
				break;
			case 6:
				f = new T(new Position(x,y));
				break;
			default:
				f = new T(new Position(x,y));
				break;
		}
		return f;
	}
	
	/**
	 * Renvoie vrai si f peut descendre (<=> pas tout en bas ni le moindre bloc en dessous
	 * @param f la forme à tester
	 * @param dir Quel déplacement cherche-t-on à faire ? Utilisé par un switch afin d'adapter le test en fonction
	 * @return peut-elle descendre ?
	 */
	private boolean peutBouger(Forme f, Deplacements dir)
	{
		int x,y;
		
		for (int i = 0 ; i < 4 ; i++)
		{
			x = f.getXBloc(i);
			y = f.getYBloc(i);

			switch (dir)
			{
				case BAS:
					if (y == Map.HAUTEUR_MAP - 1 || this.map.getCouleur(x, y + 1) != Couleur.RIEN)
						return false;
					break;
				case GAUCHE:
					if (x == 0 || this.map.getCouleur(x - 1, y) != Couleur.RIEN)
						return false;
					break;
				case DROITE:
					if (x == Map.LARGEUR_MAP - 1 || this.map.getCouleur(x + 1, y) != Couleur.RIEN)
						return false;
					break;
				default :
					return false;
			}			
		}
		return true;
	}
	
}

