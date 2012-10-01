// FIXME corriger le commentaire
/**
 * Tableau à deux dimensions resprésentant la zone de jeu.
 */
public class Map
{
	// FIXME écrire le commentaire
	// FIXME initialisation des attributs dans le constructeur
	// FIXME renommer l'attribut
	private int zdj[][] = {{0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0}};
	
	
	// FIXME constructeurs, méthodes ?
	
	// FIXME à supprimer !
	public void passe1(int x, int y)
	{
		zdj[x][y]=1;
	}

	// FIXME à supprimer !	
	public void passe0(int x, int y)
	{
		zdj[x][y]=0;
	}
	
	
	// FIXME à remplacer par la redéfinition de la méthode toString de la classe Object
	public void affiche()
	{
		int i,j;
		for(i=0;i<9;i++)
		{
			for(j=0;j<8;j++)
			{
				System.out.print(this.zdj[j][i]);
			}
			System.out.println("");
		}
	}
	
}
