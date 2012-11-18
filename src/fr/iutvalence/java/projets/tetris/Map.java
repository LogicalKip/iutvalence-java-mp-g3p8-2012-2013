package fr.iutvalence.java.projets.tetris;

/**
 * Définition de la zone de jeu dans sa globalité 
 * Chaque case de Map contient une Couleur, éventuellement RIEN.
 */
public class Map
{
	/**
	 * Nombre de cases de haut de la grille 
	 */
	public static final int HAUTEUR_MAP = 20;
	/**
	 * Nombre de cases de large de la grille 
	 */
	public static final int LARGEUR_MAP = 10;
	
	
	/**
	 * Grille du jeu représentée par une matrice de couleurs, éventuellement aucune
	 */
	private Couleur[][] zoneDeJeu;
	
	
	/**
	 * Constructeur sans paramètres : Initialisation de la grille à vide.
	 */
	public Map()
	{
		for (int i = 0 ; i < LARGEUR_MAP ; i++)
		{
			for (int j = 0 ; j < HAUTEUR_MAP ; j++)
				this.zoneDeJeu[i][j] = Couleur.RIEN;
		}
	}
	
	/**
	 * Redéfinition de toString : affiche la map sous forme de caractères représentant les blocs.
	 */
	public String toString()
	{
		int i,j;
		String s = "";
		for(j = 0 ; j < HAUTEUR_MAP ; j ++)
		{
			for(i = 0 ; i < LARGEUR_MAP ; i++)
				s = s + (this.zoneDeJeu[i][j]);

			s = s + '\n';
		}
		return s;
	}
	
	//FIXME il faudra peut-être rajouter des méthodes permettant de modifier la couleur d'une case, d'éliminer les lignes pleines, ...
	
}
