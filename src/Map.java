/**
 * Tableau à deux dimensions resprésentant la zone de jeu.
 */
public class Map
{
	private int zdj[][] = {{0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0}};
	
	public void passe1(int x, int y)
	{
		zdj[x][y]=1;
	}
	
	public void passe0(int x, int y)
	{
		zdj[x][y]=0;
	}
	
	public void affiche()
	{
		int i,j;
		for(i=0;i<8;i++)
		{
			for(j=0;j<4;j++)
			{
				System.out.print(this.zdj[i][j]);
			}
			System.out.println("");
		}
	}
	
}
