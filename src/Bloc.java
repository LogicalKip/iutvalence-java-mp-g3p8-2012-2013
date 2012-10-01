/**
 * Un seul petit carré ("pixel"). Les formes sont généralement constituées de 4 blocs
 */
public class Bloc
{
	/**
	 * absc, ord : les valeurs d'abscisse et d'ordonnée du bloc, correspondant à leur position 
	 * dans le tableau à deux dimensions qui représente la map.
	 */
	private int absc, ord;
	
	public Bloc(int x, int y)
	{
		this.absc = x;
		this.ord = y;
	}
	
	public void descendre()
	{
		this.ord = this.ord + 1;
	}
	
	public int abscisse()
	{
		return absc;
	}

	public int ordonnee()
	{
		return ord;
	}
}
