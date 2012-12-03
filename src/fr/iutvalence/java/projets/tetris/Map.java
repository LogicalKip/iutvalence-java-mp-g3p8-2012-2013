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
	 *  [LARGEUR][HAUTEUR] 0, 0 en haut à gauche
	 */
	private Couleur[][] zoneDeJeu;
	
	
	/**
	 * Constructeur sans paramètres : Initialisation de la grille à vide.
	 */
	public Map()
	{
		this.zoneDeJeu = new Couleur[LARGEUR_MAP][HAUTEUR_MAP];
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
			{
				if (this.zoneDeJeu[i][j] == Couleur.RIEN)
					s = s + '+';
				else
					s = s + '@';
			}

			s = s + '\n';
		}
		return s;
	}
	
	
	/**
	 * POUR DEBUG ET PRIVATE : NE PAS UTILISER AUTREMENT
	 * TODO Remettre la portée à private une fois les besoins du debug terminés
	 * @param x largeur
	 * @param y hauteur
	 * @param c couleur
	 */
	public void setCouleur(int x, int y, Couleur c)
	{
		this.zoneDeJeu[x][y] = c;
	}
	
	/**
	 * renvoie la couleur d'une case donnée
	 * @param x abscisses
	 * @param y ordonnées
	 * @return la couleur à l'indice x,y
	 */
	public Couleur getCouleur(int x, int y)
	{
		return this.zoneDeJeu[x][y];
	}
	
	/**
	 * Considère les blocs qui composent la forme passée en paramètre comme "fixes", "sur la map"
	 * Il faut IMPERATIVEMENT vérifier que la forme ne dépasse pas les limites de la map avant invocation
	 * @param f la forme que l'on "appliquera" sur la map
	 */
	public void poserForme(Forme f)
	{
		for (int i = 0 ; i < 4 ; i++)
			this.setCouleur(f.getXBloc(i), f.getYBloc(i), f.getColor());			
	}
	/**
	 * Supprime les lignes pleines (eventuellement aucune) et descend toutes les lignes supérieures
	 */
	public void supprLignes()
	{
		boolean lignePleine;
		for(int ligneCour=0;ligneCour<HAUTEUR_MAP;ligneCour++)
		{ // Pour chaque ligne
			
			lignePleine=true;
			for(int colonne=0;colonne<LARGEUR_MAP;colonne++)
			{ // On vérifie si la ligne est pleine
				if(this.getCouleur(colonne, ligneCour)==Couleur.RIEN)
					lignePleine=false; // + break ?
			}
			if(lignePleine)
			{
				for(int colonne=0;colonne<LARGEUR_MAP;colonne++) // Supprimer la ligne				
					this.setCouleur(colonne, ligneCour, Couleur.RIEN);			
				
				// Descendre tout d'un bloc :
				/* Pour chaque ligne, depuis celle au-dessus de la détruite, jusqu'à la plus haute,
				   je mets dans celle qui est dessous le contenu de la courante.
				   à la fin je supprime la plus haute. */
				for (int i = ligneCour - 1 ; i >= 0 ; i--)
				{
					for (int colonne = 0 ; colonne < LARGEUR_MAP ; colonne++)
						this.setCouleur(colonne, i + 1, this.zoneDeJeu[colonne][i]);			
				}
				
				for(int colonne=0;colonne<LARGEUR_MAP;colonne++) // Supprimer la ligne la plus haute				
					this.setCouleur(colonne, 0, Couleur.RIEN);
			}
		}
	}
	//FIXME il faudra peut-être rajouter des méthodes permettant de modifier la couleur d'une case, ...
	
}
