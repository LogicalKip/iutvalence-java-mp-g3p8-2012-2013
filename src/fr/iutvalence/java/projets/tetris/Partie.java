package fr.iutvalence.java.projets.tetris;


/**
 *  
 * Classe centrale de l'application : début du jeu 
 * TODO (différents selon des paramètrse choisis précédemment et fournis) 
 * affichage de la Map, des Formes, interaction avec le joueur 
 * @author duplanm
 */
public class Partie
{
	/**
	 * Appel de la classe Map avant initialisation et lancement de la partie
	 */
	public Map map;
	
	
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
		
	}
	
	//TODO Commencer la méthode
	/**
	 * Renvoie une Forme aléatoire
	 * @return renvoie la forme générée aléatoirement
	 */
	private Forme randForme()
	{
		Forme f = new Barre(new Position(1,1));
		return f;
	}
}

