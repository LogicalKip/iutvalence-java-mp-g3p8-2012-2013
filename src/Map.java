/**
 * Définition de la zone de jeu dans sa globalité
 */
public class Map
{
	/**
	 * zdj : zone de jeu représentée par une matrice
	 */
	// FIXME initialisation des attributs dans le constructeur
	private int zoneDeJeu[][] = {{0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0}};
	
	
	// FIXME constructeurs, méthodes ?
	public Map()
	{
		
	}
	
	/**
	 * Redéfinition de toString : affiche la map sous forme de caractères représentant les blocs.
	 */
	public String toString()
	{
		int i,j;
		String s = "";
		for(i=0;i<9;i++)
		{
			for(j=0;j<8;j++)
			{
				s = s + (this.zoneDeJeu[j][i]);
			}
			s = s + '\n';
		}
		return s;
	}
	
}
